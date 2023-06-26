import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-place',
  templateUrl: './place.page.html',
  styleUrls: ['./place.page.scss'],
})
export class PlacePage implements OnInit {
  places: {title: string}[] = [];

  // constructor(public navCtrl: NavController, private placesService: PlacesService) {

  // }
  ngOnInit(): void {

  }

  // ionViewWillEnter() {
  //   this.places = this.placesService.getPlaces();
  // }

  // onLoadNewPlace() {
  //   this.navCtrl.push(NewPlacePage);
  // }

}
