export interface Employee{
  id:number;
  name:String;
  gender:String;
  email?:String;
  phonenumber?:number;
  contactpreferences:String;
  dateofbirth:Date;
  department:String;
  isActive:boolean;
  photopath?:String;
}
