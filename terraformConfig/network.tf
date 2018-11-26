resource "aws_vpc" "main-vpc" {
  cidr_block           = "${var.aws_vpc_ip_cidr_range}"
  enable_dns_hostnames = true
  enable_dns_support   = true

  tags {
    Name = "${var.aws_vpc_name}"
  }
}