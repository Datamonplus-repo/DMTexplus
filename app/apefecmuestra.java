package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apefecmuestra extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apefecmuestra pgm = new apefecmuestra (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apefecmuestra( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apefecmuestra.class ), "" );
   }

   public apefecmuestra( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV54UsurCod = " " ;
      AV58Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV45EmprCod ;
      GXv_char2[0] = AV46EmprNom ;
      GXv_char3[0] = AV54UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV58Station, GXv_char1, GXv_char2, GXv_char3) ;
      apefecmuestra.this.AV45EmprCod = GXv_char1[0] ;
      apefecmuestra.this.AV46EmprNom = GXv_char2[0] ;
      apefecmuestra.this.AV54UsurCod = GXv_char3[0] ;
      AV47Fec1 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47Fec1)) ? GXutil.today( ) : AV47Fec1) ;
      AV48Fec2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48Fec2)) ? GXutil.today( ) : AV48Fec2) ;
      GXt_char4 = AV42Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV45EmprCod, httpContext.getMessage( "PATHBI", ""), GXv_char3) ;
      apefecmuestra.this.GXt_char4 = GXv_char3[0] ;
      AV42Carpeta = GXt_char4 ;
      GXt_char4 = AV42Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char3) ;
      apefecmuestra.this.GXt_char4 = GXv_char3[0] ;
      AV42Carpeta = ((GXutil.strcmp("", AV42Carpeta)==0) ? GXt_char4 : AV42Carpeta) ;
      AV55NomInf = httpContext.getMessage( "Efectividad_Muestras", "") ;
      AV49File = GXutil.trim( AV42Carpeta) + "\\" + GXutil.trim( AV55NomInf) + httpContext.getMessage( ".csv", "") ;
      AV75NomInf2 = httpContext.getMessage( "DiseñosAnyoMes", "") ;
      AV76File2 = GXutil.trim( AV42Carpeta) + "\\" + GXutil.trim( AV75NomInf2) + httpContext.getMessage( ".csv", "") ;
      AV80NomInf3 = httpContext.getMessage( "HdrsMuestras", "") ;
      AV81File3 = GXutil.trim( AV42Carpeta) + "\\" + GXutil.trim( AV80NomInf3) + httpContext.getMessage( ".csv", "") ;
      AV85NomInf4 = httpContext.getMessage( "HdrscreadasdeMuestras", "") ;
      AV86File4 = GXutil.trim( AV42Carpeta) + "\\" + GXutil.trim( AV85NomInf4) + httpContext.getMessage( ".csv", "") ;
      if ( new app.core.file(remoteHandle, context).executeUdp( AV49File) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV53Stat = GXutil.deleteFile( AV49File) ;
      }
      if ( new app.core.file(remoteHandle, context).executeUdp( AV76File2) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV77stat2 = GXutil.deleteFile( AV76File2) ;
      }
      if ( new app.core.file(remoteHandle, context).executeUdp( AV81File3) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV82stat3 = GXutil.deleteFile( AV81File3) ;
      }
      if ( new app.core.file(remoteHandle, context).executeUdp( AV86File4) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV88stat4 = GXutil.deleteFile( AV86File4) ;
      }
      GXt_int5 = AV51hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV49File, GXv_int6) ;
      apefecmuestra.this.GXt_int5 = GXv_int6[0] ;
      AV51hnd = GXt_int5 ;
      GXt_int5 = AV78hnd2 ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV76File2, GXv_int6) ;
      apefecmuestra.this.GXt_int5 = GXv_int6[0] ;
      AV78hnd2 = GXt_int5 ;
      GXt_int5 = AV83hnd3 ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV81File3, GXv_int6) ;
      apefecmuestra.this.GXt_int5 = GXv_int6[0] ;
      AV83hnd3 = GXt_int5 ;
      GXt_int5 = (long)(DecimalUtil.decToDouble(AV87hnd4)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV86File4, GXv_int6) ;
      apefecmuestra.this.GXt_int5 = GXv_int6[0] ;
      AV87hnd4 = DecimalUtil.doubleToDec(GXt_int5) ;
      AV43Control = httpContext.getMessage( "Año", "") + ";" + httpContext.getMessage( "Mes", "") + ";" + httpContext.getMessage( "Hdrs Muestras", "") + ";" + httpContext.getMessage( "Hdrs generadas", "") + ";" + httpContext.getMessage( "Efectividad", "") + ";" + httpContext.getMessage( "Periodo a", "") + ";" + httpContext.getMessage( "Nª Diseños", "") + ";" + httpContext.getMessage( "Diseños", "") ;
      GXt_int7 = AV53Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV51hnd, AV43Control, GXv_int8) ;
      apefecmuestra.this.GXt_int7 = GXv_int8[0] ;
      AV53Stat = GXt_int7 ;
      System.out.println( AV43Control );
      AV79Control2 = httpContext.getMessage( "Diseño", "") + ";" + httpContext.getMessage( "Año", "") + ";" + httpContext.getMessage( "Mes", "") + ";" + httpContext.getMessage( "Contador", "") ;
      GXt_int7 = AV77stat2 ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV78hnd2, AV79Control2, GXv_int8) ;
      apefecmuestra.this.GXt_int7 = GXv_int8[0] ;
      AV77stat2 = GXt_int7 ;
      System.out.println( AV79Control2 );
      AV84control3 = httpContext.getMessage( "Diseño", "") + ";" + httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "Fecha", "") + ";" + httpContext.getMessage( "Cliente", "") + ";" + httpContext.getMessage( "Observacion", "") ;
      GXt_int7 = AV82stat3 ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV83hnd3, AV84control3, GXv_int8) ;
      apefecmuestra.this.GXt_int7 = GXv_int8[0] ;
      AV82stat3 = GXt_int7 ;
      System.out.println( AV84control3 );
      AV89Control4 = httpContext.getMessage( "Diseño", "") + ";" + httpContext.getMessage( "Hdrs Muestras", "") + ";" + httpContext.getMessage( "Metros", "") + ";" + httpContext.getMessage( "Fecha", "") + ";" + httpContext.getMessage( "Cliente", "") + ";" + httpContext.getMessage( "Observacion", "") ;
      GXt_int7 = AV88stat4 ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( (long)(DecimalUtil.decToDouble(AV87hnd4)), AV89Control4, GXv_int8) ;
      apefecmuestra.this.GXt_int7 = GXv_int8[0] ;
      AV88stat4 = GXt_int7 ;
      System.out.println( AV89Control4 );
      AV56bardibcli = "" ;
      GX_I = 1 ;
      while ( GX_I <= 50000 )
      {
         AV61Tab_dib[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV63g = 1 ;
      /* Using cursor P05GS2 */
      pr_default.execute(0, new Object[] {AV45EmprCod, AV47Fec1, AV48Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P05GS2_A252CliCod[0] ;
         n252CliCod = P05GS2_n252CliCod[0] ;
         A396EmprCod = P05GS2_A396EmprCod[0] ;
         A143BarDisNum = P05GS2_A143BarDisNum[0] ;
         A1798BarDibCli = P05GS2_A1798BarDibCli[0] ;
         A2010BarTipDis = P05GS2_A2010BarTipDis[0] ;
         A159BarFecGen = P05GS2_A159BarFecGen[0] ;
         A279CliNom = P05GS2_A279CliNom[0] ;
         A130BarCodPar = P05GS2_A130BarCodPar[0] ;
         A132BarCodReo = P05GS2_A132BarCodReo[0] ;
         A129BarCod = P05GS2_A129BarCod[0] ;
         A279CliNom = P05GS2_A279CliNom[0] ;
         if ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "PRENDAS", "")) == 0 ) || ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SEPARACI", "")) == 0 ) || ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "GRABACIO", "")) == 0 ) || ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "MUESTRAS", "")) == 0 ) || ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "GRAB+MUE", "")) == 0 ) || ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SOLOMUES", "")) == 0 ) || ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SOLOPREN", "")) == 0 ) || ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SEP+GRAB", "")) == 0 ) || ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "AGRABAR", "")) == 0 ) || ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "CON-GRAN", "")) == 0 ) || ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGPAPEL", "")) == 0 ) || ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "CON-PREN", "")) == 0 ) || ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGTELA", "")) == 0 ) || ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "MULTIDNO", "")) == 0 ) || ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGITAL", "")) == 0 ) || ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "PRETRATA", "")) == 0 ) )
            {
               if ( ( GXutil.year( A159BarFecGen) != AV60year ) && ! (0==AV60year) )
               {
                  /* Execute user subroutine: 'LEODIBUJOS' */
                  S121 ();
                  if ( returnInSub )
                  {
                     pr_default.close(0);
                     pr_default.close(0);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV74Efectividad = ((AV57nhdrs>0) ? DecimalUtil.doubleToDec((AV71TotalHdrs/ (double) (AV57nhdrs))*100) : DecimalUtil.doubleToDec(0)) ;
                  AV43Control = GXutil.str( AV60year, 4, 0) + ";" + GXutil.padl( GXutil.trim( GXutil.str( AV59mes, 2, 0)), (short)(2), "0") + ";" + GXutil.str( AV57nhdrs, 8, 0) + ";" + GXutil.str( AV71TotalHdrs, 10, 0) + ";" + GXutil.str( AV74Efectividad, 10, 2) + ";" + localUtil.dtoc( AV72Fec3, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.dtoc( AV73Fec4, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + GXutil.str( AV69Numerodisenyos, 10, 0) + ";" + AV68Disenyos ;
                  GXt_int7 = AV53Stat ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.core.fputs(remoteHandle, context).execute( AV51hnd, AV43Control, GXv_int8) ;
                  apefecmuestra.this.GXt_int7 = GXv_int8[0] ;
                  AV53Stat = GXt_int7 ;
                  System.out.println( AV43Control );
                  AV57nhdrs = 0 ;
                  AV71TotalHdrs = 0 ;
                  GX_I = 1 ;
                  while ( GX_I <= 50000 )
                  {
                     AV61Tab_dib[GX_I-1] = "" ;
                     GX_I = (int)(GX_I+1) ;
                  }
                  AV63g = 1 ;
               }
               else
               {
                  if ( ( GXutil.month( A159BarFecGen) != AV59mes ) && ! (0==AV59mes) )
                  {
                     /* Execute user subroutine: 'LEODIBUJOS' */
                     S121 ();
                     if ( returnInSub )
                     {
                        pr_default.close(0);
                        pr_default.close(0);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     AV74Efectividad = ((AV57nhdrs>0) ? DecimalUtil.doubleToDec((AV71TotalHdrs/ (double) (AV57nhdrs))*100) : DecimalUtil.doubleToDec(0)) ;
                     AV43Control = GXutil.str( AV60year, 4, 0) + ";" + GXutil.padl( GXutil.trim( GXutil.str( AV59mes, 2, 0)), (short)(2), "0") + ";" + GXutil.str( AV57nhdrs, 8, 0) + ";" + GXutil.str( AV71TotalHdrs, 10, 0) + ";" + GXutil.str( AV74Efectividad, 10, 2) + ";" + localUtil.dtoc( AV72Fec3, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.dtoc( AV73Fec4, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + GXutil.str( AV69Numerodisenyos, 10, 0) + ";" + AV68Disenyos ;
                     GXt_int7 = AV53Stat ;
                     GXv_int8[0] = GXt_int7 ;
                     new app.core.fputs(remoteHandle, context).execute( AV51hnd, AV43Control, GXv_int8) ;
                     apefecmuestra.this.GXt_int7 = GXv_int8[0] ;
                     AV53Stat = GXt_int7 ;
                     System.out.println( AV43Control );
                     AV57nhdrs = 0 ;
                     AV71TotalHdrs = 0 ;
                     GX_I = 1 ;
                     while ( GX_I <= 50000 )
                     {
                        AV61Tab_dib[GX_I-1] = "" ;
                        GX_I = (int)(GX_I+1) ;
                     }
                     AV63g = 1 ;
                  }
               }
               AV56bardibcli = A1798BarDibCli ;
               AV59mes = (byte)(GXutil.month( A159BarFecGen)) ;
               AV60year = (short)(GXutil.year( A159BarFecGen)) ;
               AV57nhdrs = (int)(AV57nhdrs+1) ;
               AV84control3 = A1798BarDibCli + ";" + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + ";" + localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + GXutil.trim( A279CliNom) + ";" + A143BarDisNum ;
               GXt_int7 = AV82stat3 ;
               GXv_int8[0] = GXt_int7 ;
               new app.core.fputs(remoteHandle, context).execute( AV83hnd3, AV84control3, GXv_int8) ;
               apefecmuestra.this.GXt_int7 = GXv_int8[0] ;
               AV82stat3 = GXt_int7 ;
               System.out.println( AV84control3 );
               /* Execute user subroutine: 'DIBUJO' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Execute user subroutine: 'LEODIBUJOS' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV74Efectividad = ((AV57nhdrs>0) ? DecimalUtil.doubleToDec((AV71TotalHdrs/ (double) (AV57nhdrs))*100) : DecimalUtil.doubleToDec(0)) ;
      AV43Control = GXutil.str( AV60year, 4, 0) + ";" + GXutil.padl( GXutil.trim( GXutil.str( AV59mes, 2, 0)), (short)(2), "0") + ";" + GXutil.str( AV57nhdrs, 8, 0) + ";" + GXutil.str( AV71TotalHdrs, 10, 0) + ";" + GXutil.str( AV74Efectividad, 10, 2) + ";" + localUtil.dtoc( AV72Fec3, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.dtoc( AV73Fec4, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + GXutil.str( AV69Numerodisenyos, 10, 0) + ";" + AV68Disenyos ;
      GXt_int7 = AV53Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV51hnd, AV43Control, GXv_int8) ;
      apefecmuestra.this.GXt_int7 = GXv_int8[0] ;
      AV53Stat = GXt_int7 ;
      System.out.println( AV43Control );
      GXt_int7 = AV53Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV51hnd, GXv_int8) ;
      apefecmuestra.this.GXt_int7 = GXv_int8[0] ;
      AV53Stat = GXt_int7 ;
      GXt_int7 = AV77stat2 ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV78hnd2, GXv_int8) ;
      apefecmuestra.this.GXt_int7 = GXv_int8[0] ;
      AV77stat2 = GXt_int7 ;
      GXt_int7 = AV82stat3 ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV83hnd3, GXv_int8) ;
      apefecmuestra.this.GXt_int7 = GXv_int8[0] ;
      AV82stat3 = GXt_int7 ;
      GXt_int7 = AV88stat4 ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( (long)(DecimalUtil.decToDouble(AV87hnd4)), GXv_int8) ;
      apefecmuestra.this.GXt_int7 = GXv_int8[0] ;
      AV88stat4 = GXt_int7 ;
      cleanup();
   }

   public void S111( )
   {
      /* 'DIBUJO' Routine */
      returnInSub = false ;
      AV64altadibujo = (byte)(0) ;
      AV52i = 1 ;
      while ( AV52i <= 50000 )
      {
         if ( GXutil.strcmp(AV61Tab_dib[(int)(AV52i)-1], " ") == 0 )
         {
            AV64altadibujo = (byte)(1) ;
            if (true) break;
         }
         if ( GXutil.strcmp(AV61Tab_dib[(int)(AV52i)-1], GXutil.str( AV60year, 4, 0)+GXutil.padl( GXutil.trim( GXutil.str( AV59mes, 2, 0)), (short)(2), "0")) == 0 )
         {
            if (true) break;
         }
         AV52i = (long)(AV52i+1) ;
      }
      if ( AV64altadibujo == 1 )
      {
         if ( AV63g > 50000 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Maximo 50000 registros", ""));
         }
         else
         {
            AV61Tab_dib[(int)(AV63g)-1] = GXutil.str( AV60year, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV59mes, 2, 0)), (short)(2), "0") ;
            AV79Control2 = GXutil.str( AV60year, 4, 0) + ";" + GXutil.padl( GXutil.trim( GXutil.str( AV59mes, 2, 0)), (short)(2), "0") + ";" + GXutil.str( AV63g, 10, 0) ;
            GXt_int7 = AV77stat2 ;
            GXv_int8[0] = GXt_int7 ;
            new app.core.fputs(remoteHandle, context).execute( AV78hnd2, AV79Control2, GXv_int8) ;
            apefecmuestra.this.GXt_int7 = GXv_int8[0] ;
            AV77stat2 = GXt_int7 ;
            System.out.println( AV79Control2 );
         }
         AV63g = (long)(AV63g+1) ;
      }
   }

   public void S121( )
   {
      /* 'LEODIBUJOS' Routine */
      returnInSub = false ;
      AV52i = 1 ;
      AV68Disenyos = "" ;
      AV69Numerodisenyos = 0 ;
      AV71TotalHdrs = 0 ;
      while ( AV52i <= 50000 )
      {
         if ( GXutil.strcmp(AV61Tab_dib[(int)(AV52i)-1], "") == 0 )
         {
            if (true) break;
         }
         AV66anyo = (short)(GXutil.lval( GXutil.substring( AV61Tab_dib[(int)(AV52i)-1], 1, 4))) ;
         AV67mes2 = (byte)(GXutil.lval( GXutil.substring( AV61Tab_dib[(int)(AV52i)-1], 5, 2))) ;
         if ( ( AV66anyo == AV60year ) && ( AV59mes == AV67mes2 ) )
         {
            if ( GXutil.strcmp(AV68Disenyos, "") == 0 )
            {
               AV68Disenyos = GXutil.trim( AV65dibcli) ;
            }
            else
            {
               AV68Disenyos += "/" + GXutil.trim( AV65dibcli) ;
            }
            AV69Numerodisenyos = (long)(AV69Numerodisenyos+1) ;
            GXv_char3[0] = AV45EmprCod ;
            GXv_char2[0] = AV65dibcli ;
            GXv_int9[0] = AV60year ;
            GXv_int8[0] = AV59mes ;
            GXv_int6[0] = AV70NumHdrs ;
            GXv_date10[0] = AV72Fec3 ;
            GXv_date11[0] = AV73Fec4 ;
            GXv_int12[0] = (long)(DecimalUtil.decToDouble(AV87hnd4)) ;
            new app.pefechdrs(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int9, GXv_int8, GXv_int6, GXv_date10, GXv_date11, GXv_int12) ;
            apefecmuestra.this.AV45EmprCod = GXv_char3[0] ;
            apefecmuestra.this.AV65dibcli = GXv_char2[0] ;
            apefecmuestra.this.AV60year = GXv_int9[0] ;
            apefecmuestra.this.AV59mes = GXv_int8[0] ;
            apefecmuestra.this.AV70NumHdrs = GXv_int6[0] ;
            apefecmuestra.this.AV72Fec3 = GXv_date10[0] ;
            apefecmuestra.this.AV73Fec4 = GXv_date11[0] ;
            apefecmuestra.this.AV87hnd4 = DecimalUtil.doubleToDec(GXv_int12[0]) ;
            AV71TotalHdrs = (long)(AV71TotalHdrs+AV70NumHdrs) ;
         }
         AV52i = (long)(AV52i+1) ;
      }
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pefecmuestra.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV54UsurCod = "" ;
      AV58Station = "" ;
      AV45EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV46EmprNom = "" ;
      AV47Fec1 = GXutil.nullDate() ;
      AV48Fec2 = GXutil.nullDate() ;
      AV42Carpeta = "" ;
      GXt_char4 = "" ;
      AV55NomInf = "" ;
      AV49File = "" ;
      AV75NomInf2 = "" ;
      AV76File2 = "" ;
      AV80NomInf3 = "" ;
      AV81File3 = "" ;
      AV85NomInf4 = "" ;
      AV86File4 = "" ;
      AV87hnd4 = DecimalUtil.ZERO ;
      AV43Control = "" ;
      AV79Control2 = "" ;
      AV84control3 = "" ;
      AV89Control4 = "" ;
      AV56bardibcli = "" ;
      AV61Tab_dib = new String[50000] ;
      GX_I = 1 ;
      while ( GX_I <= 50000 )
      {
         AV61Tab_dib[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P05GS2_A252CliCod = new int[1] ;
      P05GS2_n252CliCod = new boolean[] {false} ;
      P05GS2_A396EmprCod = new String[] {""} ;
      P05GS2_A143BarDisNum = new String[] {""} ;
      P05GS2_A1798BarDibCli = new String[] {""} ;
      P05GS2_A2010BarTipDis = new String[] {""} ;
      P05GS2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P05GS2_A279CliNom = new String[] {""} ;
      P05GS2_A130BarCodPar = new String[] {""} ;
      P05GS2_A132BarCodReo = new byte[1] ;
      P05GS2_A129BarCod = new int[1] ;
      A396EmprCod = "" ;
      A143BarDisNum = "" ;
      A1798BarDibCli = "" ;
      A2010BarTipDis = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A279CliNom = "" ;
      A130BarCodPar = "" ;
      AV74Efectividad = DecimalUtil.ZERO ;
      AV72Fec3 = GXutil.nullDate() ;
      AV73Fec4 = GXutil.nullDate() ;
      AV68Disenyos = "" ;
      AV65dibcli = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int6 = new long[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_int12 = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apefecmuestra__default(),
         new Object[] {
             new Object[] {
            P05GS2_A252CliCod, P05GS2_n252CliCod, P05GS2_A396EmprCod, P05GS2_A143BarDisNum, P05GS2_A1798BarDibCli, P05GS2_A2010BarTipDis, P05GS2_A159BarFecGen, P05GS2_A279CliNom, P05GS2_A130BarCodPar, P05GS2_A132BarCodReo,
            P05GS2_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV53Stat ;
   private byte AV77stat2 ;
   private byte AV82stat3 ;
   private byte AV88stat4 ;
   private byte A132BarCodReo ;
   private byte AV59mes ;
   private byte AV64altadibujo ;
   private byte GXt_int7 ;
   private byte AV67mes2 ;
   private byte GXv_int8[] ;
   private short AV60year ;
   private short AV66anyo ;
   private short GXv_int9[] ;
   private short Gx_err ;
   private int GX_I ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int AV57nhdrs ;
   private long AV51hnd ;
   private long AV78hnd2 ;
   private long AV83hnd3 ;
   private long GXt_int5 ;
   private long AV63g ;
   private long AV71TotalHdrs ;
   private long AV69Numerodisenyos ;
   private long AV52i ;
   private long AV70NumHdrs ;
   private long GXv_int6[] ;
   private long GXv_int12[] ;
   private java.math.BigDecimal AV87hnd4 ;
   private java.math.BigDecimal AV74Efectividad ;
   private String AV54UsurCod ;
   private String AV58Station ;
   private String AV45EmprCod ;
   private String GXv_char1[] ;
   private String AV46EmprNom ;
   private String AV42Carpeta ;
   private String GXt_char4 ;
   private String AV55NomInf ;
   private String AV75NomInf2 ;
   private String AV80NomInf3 ;
   private String AV85NomInf4 ;
   private String AV56bardibcli ;
   private String AV61Tab_dib[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A1798BarDibCli ;
   private String A2010BarTipDis ;
   private String A279CliNom ;
   private String A130BarCodPar ;
   private String AV65dibcli ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date AV47Fec1 ;
   private java.util.Date AV48Fec2 ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV72Fec3 ;
   private java.util.Date AV73Fec4 ;
   private java.util.Date GXv_date10[] ;
   private java.util.Date GXv_date11[] ;
   private boolean Cond_result ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private String AV49File ;
   private String AV76File2 ;
   private String AV81File3 ;
   private String AV86File4 ;
   private String AV43Control ;
   private String AV79Control2 ;
   private String AV84control3 ;
   private String AV89Control4 ;
   private String AV68Disenyos ;
   private IDataStoreProvider pr_default ;
   private int[] P05GS2_A252CliCod ;
   private boolean[] P05GS2_n252CliCod ;
   private String[] P05GS2_A396EmprCod ;
   private String[] P05GS2_A143BarDisNum ;
   private String[] P05GS2_A1798BarDibCli ;
   private String[] P05GS2_A2010BarTipDis ;
   private java.util.Date[] P05GS2_A159BarFecGen ;
   private String[] P05GS2_A279CliNom ;
   private String[] P05GS2_A130BarCodPar ;
   private byte[] P05GS2_A132BarCodReo ;
   private int[] P05GS2_A129BarCod ;
}

final  class apefecmuestra__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05GS2", "SELECT T1.CliCod, T1.EmprCod, T1.BarDisNum, T1.BarDibCli, T1.BarTipDis, T1.BarFecGen, T2.CliNom, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.BarFecGen >= ?) AND (Not (rtrim(T1.BarDibCli) IS NULL AND NOT(T1.BarDibCli IS NULL))) AND (T1.BarFecGen <= ?) ORDER BY T1.EmprCod, T1.BarFecGen ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

