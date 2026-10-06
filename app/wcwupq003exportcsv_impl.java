package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwupq003exportcsv_impl extends GXWebProcedure
{
   public wcwupq003exportcsv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV41Emprcod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV42Prdnum = httpContext.GetPar( "Prdnum") ;
            AV43CCstkfec = localUtil.parseDateParm( httpContext.GetPar( "CCstkfec")) ;
            AV44CCstkfec_to = localUtil.parseDateParm( httpContext.GetPar( "CCstkfec_to")) ;
            AV48SaldoInicial = CommonUtil.decimalVal( httpContext.GetPar( "SaldoInicial"), ".") ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S191 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S181 ();
      if ( returnInSub )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV13Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "WCWUPQ003ExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
      AV10TextFile.setSource( AV11Filename );
      AV10TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV14TextFileLine = "" + ";" + "" + ";" + ";" + httpContext.getMessage( "Producto", "") + ";" + GXutil.trim( AV42Prdnum) + " " + AV45PrdNom + ";" + ";" + httpContext.getMessage( "Saldo Inicial < ", "") + localUtil.dtoc( AV43CCstkfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " = " + ";" + GXutil.trim( GXutil.str( AV48SaldoInicial, 12, 4)) ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 1, -1));
      }
      AV14TextFileLine = "" ;
      if ( GXutil.strcmp(AV19Session.getValue("WCWUPQ003ColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCWUPQ003ColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Op", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Linea", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dia-Hora", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Salida", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Existencias", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      if ( 0 == 1 )
      {
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S161 ();
         if (returnInSub) return;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV69Seleccionar, ";", ","), GXv_char3) ;
            wcwupq003exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV28CCStkLin, 12, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV32DiaHora, ";", ","), GXv_char3) ;
            wcwupq003exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV33TipMovCc, ";", ","), GXv_char3) ;
            wcwupq003exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV34CCStkDsc, ";", ","), GXv_char3) ;
            wcwupq003exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV35CCStkCanE, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV36CCStkCanS, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV37CCStkPre, 14, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV38Exis, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV39CCStkLot, ";", ","), GXv_char3) ;
            wcwupq003exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV40Hdr, ";", ","), GXv_char3) ;
            wcwupq003exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S171 ();
         if (returnInSub) return;
         if ( GXutil.len( AV14TextFileLine) > 0 )
         {
            AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
         }
      }
      /* Using cursor P08R72 */
      pr_default.execute(0, new Object[] {AV41Emprcod, AV42Prdnum, AV43CCstkfec, AV44CCstkfec_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08R72_A396EmprCod[0] ;
         A719PrdNum = P08R72_A719PrdNum[0] ;
         A3345TipMovCc = P08R72_A3345TipMovCc[0] ;
         A3348CCStkFec = P08R72_A3348CCStkFec[0] ;
         A3343CCStkCanE = P08R72_A3343CCStkCanE[0] ;
         A3344CCStkCanS = P08R72_A3344CCStkCanS[0] ;
         A3357CCStkDsc = P08R72_A3357CCStkDsc[0] ;
         A3342CCStkLin = P08R72_A3342CCStkLin[0] ;
         A3349CCStkPre = P08R72_A3349CCStkPre[0] ;
         A5722CCStkLot = P08R72_A5722CCStkLot[0] ;
         A3352CCStkPar = P08R72_A3352CCStkPar[0] ;
         A3351CCStkReo = P08R72_A3351CCStkReo[0] ;
         A3350CCStkBar = P08R72_A3350CCStkBar[0] ;
         A3358CCStkLen = P08R72_A3358CCStkLen[0] ;
         A3353CCStkPed = P08R72_A3353CCStkPed[0] ;
         A3355CCStkUsu = P08R72_A3355CCStkUsu[0] ;
         A3356CCStkHor = P08R72_A3356CCStkHor[0] ;
         AV32DiaHora = localUtil.dtoc( A3348CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3356CCStkHor ;
         AV35CCStkCanE = A3343CCStkCanE ;
         AV36CCStkCanS = A3344CCStkCanS ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            AV50Recfec = A3348CCStkFec ;
            GXv_char3[0] = AV41Emprcod ;
            GXv_char4[0] = AV42Prdnum ;
            GXv_date5[0] = A3348CCStkFec ;
            GXv_decimal6[0] = AV62ComprasInv ;
            GXv_decimal7[0] = AV63ConsumosInv ;
            GXv_decimal8[0] = AV51RecExiRcc ;
            GXv_decimal9[0] = AV52RecExiRea ;
            GXv_decimal10[0] = AV53RecExiTcc ;
            GXv_decimal11[0] = AV54Recexiteo ;
            new app.recuento(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_date5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11) ;
            wcwupq003exportcsv_impl.this.AV41Emprcod = GXv_char3[0] ;
            wcwupq003exportcsv_impl.this.AV42Prdnum = GXv_char4[0] ;
            wcwupq003exportcsv_impl.this.A3348CCStkFec = GXv_date5[0] ;
            wcwupq003exportcsv_impl.this.AV62ComprasInv = GXv_decimal6[0] ;
            wcwupq003exportcsv_impl.this.AV63ConsumosInv = GXv_decimal7[0] ;
            wcwupq003exportcsv_impl.this.AV51RecExiRcc = GXv_decimal8[0] ;
            wcwupq003exportcsv_impl.this.AV52RecExiRea = GXv_decimal9[0] ;
            wcwupq003exportcsv_impl.this.AV53RecExiTcc = GXv_decimal10[0] ;
            wcwupq003exportcsv_impl.this.AV54Recexiteo = GXv_decimal11[0] ;
            AV38Exis = ((AV64EntSalInv==0) ? AV52RecExiRea : AV52RecExiRea.add(AV62ComprasInv).subtract(AV63ConsumosInv)) ;
            AV35CCStkCanE = DecimalUtil.doubleToDec(0) ;
            AV36CCStkCanS = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            AV38Exis = AV38Exis.add(((AV35CCStkCanE.subtract(AV36CCStkCanS)))) ;
            AV68compras = AV68compras.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", ""))==0) ? AV35CCStkCanE : DecimalUtil.doubleToDec(0)))) ;
            AV66consumos = AV66consumos.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SC", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", ""))==0) ? AV36CCStkCanS : DecimalUtil.doubleToDec(0)))) ;
            AV67devoluciones = AV67devoluciones.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", ""))==0) ? AV36CCStkCanS : DecimalUtil.doubleToDec(0)))) ;
         }
         AV34CCStkDsc = A3357CCStkDsc ;
         AV33TipMovCc = A3345TipMovCc ;
         AV28CCStkLin = A3342CCStkLin ;
         AV32DiaHora = localUtil.dtoc( A3348CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3356CCStkHor ;
         AV55CCStkHor = A3356CCStkHor ;
         AV37CCStkPre = A3349CCStkPre ;
         AV35CCStkCanE = A3343CCStkCanE ;
         AV36CCStkCanS = A3344CCStkCanS ;
         AV39CCStkLot = A5722CCStkLot ;
         AV40Hdr = ((A3350CCStkBar==0) ? " " : GXutil.str( A3350CCStkBar, 8, 0)+"-"+GXutil.str( A3351CCStkReo, 1, 0)+A3352CCStkPar) ;
         AV56CCStkBar = A3350CCStkBar ;
         AV57CCStkreo = A3351CCStkReo ;
         AV58CCStkpar = A3352CCStkPar ;
         AV59CCStkLen = A3358CCStkLen ;
         AV60CCStkPed = A3353CCStkPed ;
         AV61CCstkusu = A3355CCStkUsu ;
         AV40Hdr = ((A3350CCStkBar==0) ? " " : GXutil.str( A3350CCStkBar, 8, 0)+"-"+GXutil.str( A3351CCStkReo, 1, 0)+A3352CCStkPar) ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S161 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char4[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV69Seleccionar, ";", ","), GXv_char4) ;
            wcwupq003exportcsv_impl.this.GXt_char2 = GXv_char4[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV28CCStkLin, 12, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char4[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV32DiaHora, ";", ","), GXv_char4) ;
            wcwupq003exportcsv_impl.this.GXt_char2 = GXv_char4[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char4[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV33TipMovCc, ";", ","), GXv_char4) ;
            wcwupq003exportcsv_impl.this.GXt_char2 = GXv_char4[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char4[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV34CCStkDsc, ";", ","), GXv_char4) ;
            wcwupq003exportcsv_impl.this.GXt_char2 = GXv_char4[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV35CCStkCanE, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV36CCStkCanS, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV37CCStkPre, 14, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV38Exis, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char4[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV39CCStkLot, ";", ","), GXv_char4) ;
            wcwupq003exportcsv_impl.this.GXt_char2 = GXv_char4[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char4[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV40Hdr, ";", ","), GXv_char4) ;
            wcwupq003exportcsv_impl.this.GXt_char2 = GXv_char4[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S171 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.len( AV14TextFileLine) > 0 )
         {
            AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV10TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCWUPQ003ExportCSV.csv");
         }
         AV27HttpResponse.addFile(AV10TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10TextFile.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10TextFile.getErrDescription() ;
         AV10TextFile.close();
         AV27HttpResponse.addString(AV12ErrorMessage);
         httpContext.nUserReturn = (byte)(1) ;
         if ( httpContext.willRedirect( ) )
         {
            httpContext.redirect( httpContext.wjLoc );
            httpContext.wjLoc = "" ;
         }
         returnInSub = true;
         if (true) return;
      }
   }

   public void S141( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV15ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&Seleccionar", "", "Op", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&CCStkLin", "", "Linea", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&DiaHora", "", "Dia-Hora", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&TipMovCc", "", "Tipo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&CCStkDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&CCStkCanE", "", "Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&CCStkCanS", "", "Salida", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&CCStkPre", "", "Precio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&Exis", "", "Existencias", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&CCStkLot", "", "Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&Hdr", "", "N Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char4[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWUPQ003ColumnsSelector", GXv_char4) ;
      wcwupq003exportcsv_impl.this.GXt_char2 = GXv_char4[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WCWUPQ003GridState"), "") == 0 )
      {
         AV30GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWUPQ003GridState"), null, null);
      }
      else
      {
         AV30GridState.fromxml(AV19Session.getValue("WCWUPQ003GridState"), null, null);
      }
      AV78GXV1 = 1 ;
      while ( AV78GXV1 <= AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV78GXV1));
         if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TIPMOVCCIN") == 0 )
         {
            AV74TipMovCcIN = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV41Emprcod = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV42Prdnum = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CCSTKFEC") == 0 )
         {
            AV43CCstkfec = localUtil.ctod( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CCSTKFEC_TO") == 0 )
         {
            AV44CCstkfec_to = localUtil.ctod( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNOM") == 0 )
         {
            AV45PrdNom = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDEXIALM") == 0 )
         {
            AV46PrdExialm = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDCANRES") == 0 )
         {
            AV47PrdCanres = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SALDOINICIAL") == 0 )
         {
            AV48SaldoInicial = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EXISTENCIAS") == 0 )
         {
            AV49Existencias = (short)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV78GXV1 = (int)(AV78GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S171( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV41Emprcod = "" ;
      AV42Prdnum = "" ;
      AV43CCstkfec = GXutil.nullDate() ;
      AV44CCstkfec_to = GXutil.nullDate() ;
      AV48SaldoInicial = DecimalUtil.ZERO ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV45PrdNom = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV69Seleccionar = "" ;
      AV32DiaHora = "" ;
      AV33TipMovCc = "" ;
      AV34CCStkDsc = "" ;
      AV35CCStkCanE = DecimalUtil.ZERO ;
      AV36CCStkCanS = DecimalUtil.ZERO ;
      AV37CCStkPre = DecimalUtil.ZERO ;
      AV38Exis = DecimalUtil.ZERO ;
      AV39CCStkLot = "" ;
      AV40Hdr = "" ;
      scmdbuf = "" ;
      P08R72_A396EmprCod = new String[] {""} ;
      P08R72_A719PrdNum = new String[] {""} ;
      P08R72_A3345TipMovCc = new String[] {""} ;
      P08R72_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08R72_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08R72_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08R72_A3357CCStkDsc = new String[] {""} ;
      P08R72_A3342CCStkLin = new long[1] ;
      P08R72_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08R72_A5722CCStkLot = new String[] {""} ;
      P08R72_A3352CCStkPar = new String[] {""} ;
      P08R72_A3351CCStkReo = new byte[1] ;
      P08R72_A3350CCStkBar = new int[1] ;
      P08R72_A3358CCStkLen = new short[1] ;
      P08R72_A3353CCStkPed = new int[1] ;
      P08R72_A3355CCStkUsu = new String[] {""} ;
      P08R72_A3356CCStkHor = new String[] {""} ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A3345TipMovCc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3357CCStkDsc = "" ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      A3352CCStkPar = "" ;
      A3355CCStkUsu = "" ;
      A3356CCStkHor = "" ;
      AV50Recfec = GXutil.nullDate() ;
      GXv_char3 = new String[1] ;
      GXv_date5 = new java.util.Date[1] ;
      AV62ComprasInv = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV63ConsumosInv = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV51RecExiRcc = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV52RecExiRea = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV53RecExiTcc = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV54Recexiteo = DecimalUtil.ZERO ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      AV68compras = DecimalUtil.ZERO ;
      AV66consumos = DecimalUtil.ZERO ;
      AV67devoluciones = DecimalUtil.ZERO ;
      AV55CCStkHor = "" ;
      AV58CCStkpar = "" ;
      AV61CCstkusu = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char4 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV30GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV31GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV74TipMovCcIN = "" ;
      AV46PrdExialm = DecimalUtil.ZERO ;
      AV47PrdCanres = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwupq003exportcsv__default(),
         new Object[] {
             new Object[] {
            P08R72_A396EmprCod, P08R72_A719PrdNum, P08R72_A3345TipMovCc, P08R72_A3348CCStkFec, P08R72_A3343CCStkCanE, P08R72_A3344CCStkCanS, P08R72_A3357CCStkDsc, P08R72_A3342CCStkLin, P08R72_A3349CCStkPre, P08R72_A5722CCStkLot,
            P08R72_A3352CCStkPar, P08R72_A3351CCStkReo, P08R72_A3350CCStkBar, P08R72_A3358CCStkLen, P08R72_A3353CCStkPed, P08R72_A3355CCStkUsu, P08R72_A3356CCStkHor
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3351CCStkReo ;
   private byte AV57CCStkreo ;
   private short gxcookieaux ;
   private short A3358CCStkLen ;
   private short AV64EntSalInv ;
   private short AV59CCStkLen ;
   private short AV49Existencias ;
   private short Gx_err ;
   private int AV13Random ;
   private int A3350CCStkBar ;
   private int A3353CCStkPed ;
   private int AV56CCStkBar ;
   private int AV60CCStkPed ;
   private int AV78GXV1 ;
   private long AV28CCStkLin ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV48SaldoInicial ;
   private java.math.BigDecimal AV35CCStkCanE ;
   private java.math.BigDecimal AV36CCStkCanS ;
   private java.math.BigDecimal AV37CCStkPre ;
   private java.math.BigDecimal AV38Exis ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal AV62ComprasInv ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV63ConsumosInv ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV51RecExiRcc ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV52RecExiRea ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV53RecExiTcc ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV54Recexiteo ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal AV68compras ;
   private java.math.BigDecimal AV66consumos ;
   private java.math.BigDecimal AV67devoluciones ;
   private java.math.BigDecimal AV46PrdExialm ;
   private java.math.BigDecimal AV47PrdCanres ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV41Emprcod ;
   private String AV42Prdnum ;
   private String AV45PrdNom ;
   private String AV69Seleccionar ;
   private String AV32DiaHora ;
   private String AV33TipMovCc ;
   private String AV34CCStkDsc ;
   private String AV39CCStkLot ;
   private String AV40Hdr ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A3345TipMovCc ;
   private String A3357CCStkDsc ;
   private String A5722CCStkLot ;
   private String A3352CCStkPar ;
   private String A3355CCStkUsu ;
   private String A3356CCStkHor ;
   private String GXv_char3[] ;
   private String AV55CCStkHor ;
   private String AV58CCStkpar ;
   private String AV61CCstkusu ;
   private String GXt_char2 ;
   private String GXv_char4[] ;
   private String AV74TipMovCcIN ;
   private java.util.Date AV43CCstkfec ;
   private java.util.Date AV44CCstkfec_to ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV50Recfec ;
   private java.util.Date GXv_date5[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08R72_A396EmprCod ;
   private String[] P08R72_A719PrdNum ;
   private String[] P08R72_A3345TipMovCc ;
   private java.util.Date[] P08R72_A3348CCStkFec ;
   private java.math.BigDecimal[] P08R72_A3343CCStkCanE ;
   private java.math.BigDecimal[] P08R72_A3344CCStkCanS ;
   private String[] P08R72_A3357CCStkDsc ;
   private long[] P08R72_A3342CCStkLin ;
   private java.math.BigDecimal[] P08R72_A3349CCStkPre ;
   private String[] P08R72_A5722CCStkLot ;
   private String[] P08R72_A3352CCStkPar ;
   private byte[] P08R72_A3351CCStkReo ;
   private int[] P08R72_A3350CCStkBar ;
   private short[] P08R72_A3358CCStkLen ;
   private int[] P08R72_A3353CCStkPed ;
   private String[] P08R72_A3355CCStkUsu ;
   private String[] P08R72_A3356CCStkHor ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV30GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV31GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class wcwupq003exportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08R72", "SELECT EmprCod, PrdNum, TipMovCc, CCStkFec, CCStkCanE, CCStkCanS, CCStkDsc, CCStkLin, CCStkPre, CCStkLot, CCStkPar, CCStkReo, CCStkBar, CCStkLen, CCStkPed, CCStkUsu, CCStkHor FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ? and CCStkFec >= ?) AND (TipMovCc <> 'EC') AND (CCStkFec <= ?) ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 8);
               ((String[]) buf[16])[0] = rslt.getString(17, 8);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
      }
   }

}

