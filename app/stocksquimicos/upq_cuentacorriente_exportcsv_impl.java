package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class upq_cuentacorriente_exportcsv_impl extends GXWebProcedure
{
   public upq_cuentacorriente_exportcsv_impl( com.genexus.internet.HttpContext context )
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
         AV35Emprcod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV51Prdnum = httpContext.GetPar( "Prdnum") ;
            AV19CCstkfec = localUtil.parseDateParm( httpContext.GetPar( "CCstkfec")) ;
            AV20CCstkfec_to = localUtil.parseDateParm( httpContext.GetPar( "CCstkfec_to")) ;
            AV57SaldoInicial = CommonUtil.decimalVal( httpContext.GetPar( "SaldoInicial"), ".") ;
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
      GXv_SdtWWPContext1[0] = AV64WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV64WWPContext = GXv_SdtWWPContext1[0] ;
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
      AV52Random = (int)(GXutil.random( )*10000) ;
      AV40Filename = "UPQ_CuentaCorriente_ExportCSV-" + GXutil.trim( GXutil.str( AV52Random, 8, 0)) + ".csv" ;
      AV59TextFile.setSource( AV40Filename );
      AV59TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV59TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV60TextFileLine = "" + ";" + "" + ";" + ";" + httpContext.getMessage( "Producto", "") + ";" + GXutil.trim( AV51Prdnum) + " " + AV50PrdNom + ";" + ";" + httpContext.getMessage( "Saldo Inicial < ", "") + localUtil.dtoc( AV19CCstkfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " = " + ";" + GXutil.trim( GXutil.str( AV57SaldoInicial, 12, 4)) ;
      if ( GXutil.len( AV60TextFileLine) > 0 )
      {
         AV59TextFile.writeLine(GXutil.substring( AV60TextFileLine, 1, -1));
      }
      AV60TextFileLine = "" ;
      if ( GXutil.strcmp(AV58Session.getValue("UPQ_CuentaCorrienteColumnsSelector"), "") != 0 )
      {
         AV28ColumnsSelectorXML = AV58Session.getValue("UPQ_CuentaCorrienteColumnsSelector") ;
         AV25ColumnsSelector.fromxml(AV28ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV60TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Linea", "") : "") ;
      AV60TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dia-Hora", "") : "") ;
      AV60TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV60TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV60TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Entrada", "") : "") ;
      AV60TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Salida", "") : "") ;
      AV60TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio", "") : "") ;
      AV60TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Existencias", "") : "") ;
      AV60TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      AV60TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Caducidad", "") : "") ;
      AV60TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
      AV60TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ususario", "") : "") ;
      if ( GXutil.len( AV60TextFileLine) > 0 )
      {
         AV59TextFile.writeLine(GXutil.substring( AV60TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      if ( 0 == 1 )
      {
         AV60TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S161 ();
         if (returnInSub) return;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            AV60TextFileLine += GXutil.str( AV21CCStkLin, 12, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            GXt_char2 = AV60TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV34DiaHora, ";", ","), GXv_char3) ;
            upq_cuentacorriente_exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV60TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            GXt_char2 = AV60TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV61TipMovCc, ";", ","), GXv_char3) ;
            upq_cuentacorriente_exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV60TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            GXt_char2 = AV60TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV18CCStkDsc, ";", ","), GXv_char3) ;
            upq_cuentacorriente_exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV60TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            AV60TextFileLine += GXutil.str( AV16CCStkCanE, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            AV60TextFileLine += GXutil.str( AV17CCStkCanS, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            AV60TextFileLine += GXutil.str( AV23CCStkPre, 14, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            AV60TextFileLine += GXutil.str( AV38Exis, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            GXt_char2 = AV60TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV22CCStkLot, ";", ","), GXv_char3) ;
            upq_cuentacorriente_exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV60TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            AV60TextFileLine += localUtil.dtoc( AV74CCStkLotFech, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            GXt_char2 = AV60TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV44Hdr, ";", ","), GXv_char3) ;
            upq_cuentacorriente_exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV60TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            GXt_char2 = AV60TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV14CCstkusu, ";", ","), GXv_char3) ;
            upq_cuentacorriente_exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV60TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S171 ();
         if (returnInSub) return;
         if ( GXutil.len( AV60TextFileLine) > 0 )
         {
            AV59TextFile.writeLine(GXutil.substring( AV60TextFileLine, 2, -1));
         }
      }
      AV38Exis = AV57SaldoInicial ;
      /* Using cursor P09GO2 */
      pr_default.execute(0, new Object[] {AV35Emprcod, AV51Prdnum, AV19CCstkfec, AV20CCstkfec_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09GO2_A396EmprCod[0] ;
         A719PrdNum = P09GO2_A719PrdNum[0] ;
         A3345TipMovCc = P09GO2_A3345TipMovCc[0] ;
         A3348CCStkFec = P09GO2_A3348CCStkFec[0] ;
         A3357CCStkDsc = P09GO2_A3357CCStkDsc[0] ;
         A3342CCStkLin = P09GO2_A3342CCStkLin[0] ;
         A3349CCStkPre = P09GO2_A3349CCStkPre[0] ;
         A3343CCStkCanE = P09GO2_A3343CCStkCanE[0] ;
         A3344CCStkCanS = P09GO2_A3344CCStkCanS[0] ;
         A5722CCStkLot = P09GO2_A5722CCStkLot[0] ;
         A3352CCStkPar = P09GO2_A3352CCStkPar[0] ;
         A3351CCStkReo = P09GO2_A3351CCStkReo[0] ;
         A3350CCStkBar = P09GO2_A3350CCStkBar[0] ;
         A3358CCStkLen = P09GO2_A3358CCStkLen[0] ;
         A3353CCStkPed = P09GO2_A3353CCStkPed[0] ;
         A3355CCStkUsu = P09GO2_A3355CCStkUsu[0] ;
         A13979CCStkLotFe = P09GO2_A13979CCStkLotFe[0] ;
         A3356CCStkHor = P09GO2_A3356CCStkHor[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            AV15Recfec = A3348CCStkFec ;
            GXv_char3[0] = AV35Emprcod ;
            GXv_char4[0] = AV51Prdnum ;
            GXv_date5[0] = A3348CCStkFec ;
            GXv_decimal6[0] = AV32ComprasInv ;
            GXv_decimal7[0] = AV33ConsumosInv ;
            GXv_decimal8[0] = AV53RecExiRcc ;
            GXv_decimal9[0] = AV54RecExiRea ;
            GXv_decimal10[0] = AV55RecExiTcc ;
            GXv_decimal11[0] = AV56Recexiteo ;
            new app.recuento(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_date5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11) ;
            upq_cuentacorriente_exportcsv_impl.this.AV35Emprcod = GXv_char3[0] ;
            upq_cuentacorriente_exportcsv_impl.this.AV51Prdnum = GXv_char4[0] ;
            upq_cuentacorriente_exportcsv_impl.this.A3348CCStkFec = GXv_date5[0] ;
            upq_cuentacorriente_exportcsv_impl.this.AV32ComprasInv = GXv_decimal6[0] ;
            upq_cuentacorriente_exportcsv_impl.this.AV33ConsumosInv = GXv_decimal7[0] ;
            upq_cuentacorriente_exportcsv_impl.this.AV53RecExiRcc = GXv_decimal8[0] ;
            upq_cuentacorriente_exportcsv_impl.this.AV54RecExiRea = GXv_decimal9[0] ;
            upq_cuentacorriente_exportcsv_impl.this.AV55RecExiTcc = GXv_decimal10[0] ;
            upq_cuentacorriente_exportcsv_impl.this.AV56Recexiteo = GXv_decimal11[0] ;
            AV38Exis = ((AV36EntSalInv==0) ? AV54RecExiRea : AV54RecExiRea.add(AV32ComprasInv).subtract(AV33ConsumosInv)) ;
         }
         AV18CCStkDsc = A3357CCStkDsc ;
         AV61TipMovCc = A3345TipMovCc ;
         AV21CCStkLin = A3342CCStkLin ;
         AV34DiaHora = localUtil.dtoc( A3348CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3356CCStkHor ;
         AV19CCstkfec = A3348CCStkFec ;
         AV9CCStkHor = A3356CCStkHor ;
         AV23CCStkPre = A3349CCStkPre ;
         AV16CCStkCanE = A3343CCStkCanE ;
         AV17CCStkCanS = A3344CCStkCanS ;
         AV22CCStkLot = A5722CCStkLot ;
         AV44Hdr = ((A3350CCStkBar==0) ? " " : GXutil.str( A3350CCStkBar, 8, 0)+"-"+GXutil.str( A3351CCStkReo, 1, 0)+A3352CCStkPar) ;
         AV8CCStkBar = A3350CCStkBar ;
         AV13CCStkreo = A3351CCStkReo ;
         AV11CCStkpar = A3352CCStkPar ;
         AV51Prdnum = A719PrdNum ;
         AV10CCStkLen = A3358CCStkLen ;
         AV12CCStkPed = A3353CCStkPed ;
         AV14CCstkusu = A3355CCStkUsu ;
         AV74CCStkLotFech = A13979CCStkLotFe ;
         AV16CCStkCanE = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : AV16CCStkCanE) ;
         AV17CCStkCanS = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : AV17CCStkCanS) ;
         AV38Exis = AV38Exis.add((AV16CCStkCanE.subtract(AV17CCStkCanS))) ;
         AV60TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S161 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            AV60TextFileLine += GXutil.str( AV21CCStkLin, 12, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            GXt_char2 = AV60TextFileLine ;
            GXv_char4[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV34DiaHora, ";", ","), GXv_char4) ;
            upq_cuentacorriente_exportcsv_impl.this.GXt_char2 = GXv_char4[0] ;
            AV60TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            GXt_char2 = AV60TextFileLine ;
            GXv_char4[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV61TipMovCc, ";", ","), GXv_char4) ;
            upq_cuentacorriente_exportcsv_impl.this.GXt_char2 = GXv_char4[0] ;
            AV60TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            GXt_char2 = AV60TextFileLine ;
            GXv_char4[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV18CCStkDsc, ";", ","), GXv_char4) ;
            upq_cuentacorriente_exportcsv_impl.this.GXt_char2 = GXv_char4[0] ;
            AV60TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            AV60TextFileLine += GXutil.str( AV16CCStkCanE, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            AV60TextFileLine += GXutil.str( AV17CCStkCanS, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            AV60TextFileLine += GXutil.str( AV23CCStkPre, 14, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            AV60TextFileLine += GXutil.str( AV38Exis, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            GXt_char2 = AV60TextFileLine ;
            GXv_char4[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV22CCStkLot, ";", ","), GXv_char4) ;
            upq_cuentacorriente_exportcsv_impl.this.GXt_char2 = GXv_char4[0] ;
            AV60TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            AV60TextFileLine += localUtil.dtoc( AV74CCStkLotFech, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            GXt_char2 = AV60TextFileLine ;
            GXv_char4[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV44Hdr, ";", ","), GXv_char4) ;
            upq_cuentacorriente_exportcsv_impl.this.GXt_char2 = GXv_char4[0] ;
            AV60TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV60TextFileLine += ";" ;
            GXt_char2 = AV60TextFileLine ;
            GXv_char4[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV14CCstkusu, ";", ","), GXv_char4) ;
            upq_cuentacorriente_exportcsv_impl.this.GXt_char2 = GXv_char4[0] ;
            AV60TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S171 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.len( AV60TextFileLine) > 0 )
         {
            AV59TextFile.writeLine(GXutil.substring( AV60TextFileLine, 2, -1));
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV59TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV59TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV45HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV45HttpResponse.addHeader("Content-Disposition", "attachment;filename=UPQ_CuentaCorrienteExportCSV.csv");
         }
         AV45HttpResponse.addFile(AV59TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV59TextFile.getErrCode() != 0 )
      {
         AV40Filename = "" ;
         AV37ErrorMessage = AV59TextFile.getErrDescription() ;
         AV59TextFile.close();
         AV45HttpResponse.addString(AV37ErrorMessage);
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
      AV25ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&CCStkLin", "", "Linea", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&DiaHora", "", "Dia-Hora", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&TipMovCc", "", "Tipo", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&CCStkDsc", "", "Descripcion", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&CCStkCanE", "", "Entrada", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&CCStkCanS", "", "Salida", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&CCStkPre", "", "Precio", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&Exis", "", "Existencias", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&CCStkLot", "", "Lote", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&CCStkLot", "", "Fecha Caducidad", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&Hdr", "", "N Hdr", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&CCStkLot", "", "usuario", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char2 = AV62UserCustomValue ;
      GXv_char4[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "UPQ_CuentaCorrienteColumnsSelector", GXv_char4) ;
      upq_cuentacorriente_exportcsv_impl.this.GXt_char2 = GXv_char4[0] ;
      AV62UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV62UserCustomValue)==0) ) )
      {
         AV27ColumnsSelectorAux.fromxml(AV62UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV27ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV25ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV27ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV25ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV58Session.getValue("UPQ_CuentaCorrienteGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "UPQ_CuentaCorrienteGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV58Session.getValue("UPQ_CuentaCorrienteGridState"), null, null);
      }
      AV78GXV1 = 1 ;
      while ( AV78GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV78GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TIPMOVCCIN") == 0 )
         {
            AV73TipMovCcIN = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV35Emprcod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV51Prdnum = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CCSTKFEC") == 0 )
         {
            AV19CCstkfec = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CCSTKFEC_TO") == 0 )
         {
            AV20CCstkfec_to = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNOM") == 0 )
         {
            AV50PrdNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDEXIALM") == 0 )
         {
            AV49PrdExialm = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDCANRES") == 0 )
         {
            AV48PrdCanres = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SALDOINICIAL") == 0 )
         {
            AV57SaldoInicial = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EXISTENCIAS") == 0 )
         {
            AV39Existencias = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
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

   public void S201( )
   {
      /* 'RECUENTO' Routine */
      returnInSub = false ;
      AV56Recexiteo = DecimalUtil.doubleToDec(0) ;
      AV54RecExiRea = DecimalUtil.doubleToDec(0) ;
      AV55RecExiTcc = DecimalUtil.doubleToDec(0) ;
      AV53RecExiRcc = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P09GO3 */
      pr_default.execute(1, new Object[] {AV35Emprcod, AV51Prdnum, AV15Recfec});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A810RecFec = P09GO3_A810RecFec[0] ;
         A719PrdNum = P09GO3_A719PrdNum[0] ;
         A396EmprCod = P09GO3_A396EmprCod[0] ;
         A809RecExiTeo = P09GO3_A809RecExiTeo[0] ;
         A807RecExiRea = P09GO3_A807RecExiRea[0] ;
         A808RecExiTcc = P09GO3_A808RecExiTcc[0] ;
         A806RecExiRcc = P09GO3_A806RecExiRcc[0] ;
         AV56Recexiteo = A809RecExiTeo ;
         AV54RecExiRea = A807RecExiRea ;
         AV55RecExiTcc = A808RecExiTcc ;
         AV53RecExiRcc = A806RecExiRcc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      GXv_char4[0] = AV35Emprcod ;
      GXv_char3[0] = AV51Prdnum ;
      GXv_date5[0] = AV15Recfec ;
      GXv_decimal11[0] = AV32ComprasInv ;
      GXv_decimal10[0] = AV33ConsumosInv ;
      new app.pprc124(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date5, GXv_decimal11, GXv_decimal10) ;
      upq_cuentacorriente_exportcsv_impl.this.AV35Emprcod = GXv_char4[0] ;
      upq_cuentacorriente_exportcsv_impl.this.AV51Prdnum = GXv_char3[0] ;
      upq_cuentacorriente_exportcsv_impl.this.AV15Recfec = GXv_date5[0] ;
      upq_cuentacorriente_exportcsv_impl.this.AV32ComprasInv = GXv_decimal11[0] ;
      upq_cuentacorriente_exportcsv_impl.this.AV33ConsumosInv = GXv_decimal10[0] ;
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
      AV35Emprcod = "" ;
      AV51Prdnum = "" ;
      AV19CCstkfec = GXutil.nullDate() ;
      AV20CCstkfec_to = GXutil.nullDate() ;
      AV57SaldoInicial = DecimalUtil.ZERO ;
      AV64WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV40Filename = "" ;
      AV59TextFile = new com.genexus.util.GXFile();
      AV60TextFileLine = "" ;
      AV50PrdNom = "" ;
      AV58Session = httpContext.getWebSession();
      AV28ColumnsSelectorXML = "" ;
      AV25ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV34DiaHora = "" ;
      AV61TipMovCc = "" ;
      AV18CCStkDsc = "" ;
      AV16CCStkCanE = DecimalUtil.ZERO ;
      AV17CCStkCanS = DecimalUtil.ZERO ;
      AV23CCStkPre = DecimalUtil.ZERO ;
      AV38Exis = DecimalUtil.ZERO ;
      AV22CCStkLot = "" ;
      AV74CCStkLotFech = GXutil.nullDate() ;
      AV44Hdr = "" ;
      AV14CCstkusu = "" ;
      scmdbuf = "" ;
      P09GO2_A396EmprCod = new String[] {""} ;
      P09GO2_A719PrdNum = new String[] {""} ;
      P09GO2_A3345TipMovCc = new String[] {""} ;
      P09GO2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09GO2_A3357CCStkDsc = new String[] {""} ;
      P09GO2_A3342CCStkLin = new long[1] ;
      P09GO2_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GO2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GO2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GO2_A5722CCStkLot = new String[] {""} ;
      P09GO2_A3352CCStkPar = new String[] {""} ;
      P09GO2_A3351CCStkReo = new byte[1] ;
      P09GO2_A3350CCStkBar = new int[1] ;
      P09GO2_A3358CCStkLen = new short[1] ;
      P09GO2_A3353CCStkPed = new int[1] ;
      P09GO2_A3355CCStkUsu = new String[] {""} ;
      P09GO2_A13979CCStkLotFe = new java.util.Date[] {GXutil.nullDate()} ;
      P09GO2_A3356CCStkHor = new String[] {""} ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A3345TipMovCc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3357CCStkDsc = "" ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      A3352CCStkPar = "" ;
      A3355CCStkUsu = "" ;
      A13979CCStkLotFe = GXutil.nullDate() ;
      A3356CCStkHor = "" ;
      AV15Recfec = GXutil.nullDate() ;
      AV32ComprasInv = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV33ConsumosInv = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV53RecExiRcc = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV54RecExiRea = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV55RecExiTcc = DecimalUtil.ZERO ;
      AV56Recexiteo = DecimalUtil.ZERO ;
      AV9CCStkHor = "" ;
      AV11CCStkpar = "" ;
      AV45HttpResponse = httpContext.getHttpResponse();
      AV37ErrorMessage = "" ;
      AV62UserCustomValue = "" ;
      GXt_char2 = "" ;
      AV27ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV73TipMovCcIN = "" ;
      AV49PrdExialm = DecimalUtil.ZERO ;
      AV48PrdCanres = DecimalUtil.ZERO ;
      P09GO3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09GO3_A719PrdNum = new String[] {""} ;
      P09GO3_A396EmprCod = new String[] {""} ;
      P09GO3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GO3_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GO3_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GO3_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A810RecFec = GXutil.nullDate() ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_date5 = new java.util.Date[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.upq_cuentacorriente_exportcsv__default(),
         new Object[] {
             new Object[] {
            P09GO2_A396EmprCod, P09GO2_A719PrdNum, P09GO2_A3345TipMovCc, P09GO2_A3348CCStkFec, P09GO2_A3357CCStkDsc, P09GO2_A3342CCStkLin, P09GO2_A3349CCStkPre, P09GO2_A3343CCStkCanE, P09GO2_A3344CCStkCanS, P09GO2_A5722CCStkLot,
            P09GO2_A3352CCStkPar, P09GO2_A3351CCStkReo, P09GO2_A3350CCStkBar, P09GO2_A3358CCStkLen, P09GO2_A3353CCStkPed, P09GO2_A3355CCStkUsu, P09GO2_A13979CCStkLotFe, P09GO2_A3356CCStkHor
            }
            , new Object[] {
            P09GO3_A810RecFec, P09GO3_A719PrdNum, P09GO3_A396EmprCod, P09GO3_A809RecExiTeo, P09GO3_A807RecExiRea, P09GO3_A808RecExiTcc, P09GO3_A806RecExiRcc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3351CCStkReo ;
   private byte AV13CCStkreo ;
   private short gxcookieaux ;
   private short A3358CCStkLen ;
   private short AV36EntSalInv ;
   private short AV10CCStkLen ;
   private short AV39Existencias ;
   private short Gx_err ;
   private int AV52Random ;
   private int A3350CCStkBar ;
   private int A3353CCStkPed ;
   private int AV8CCStkBar ;
   private int AV12CCStkPed ;
   private int AV78GXV1 ;
   private long AV21CCStkLin ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV57SaldoInicial ;
   private java.math.BigDecimal AV16CCStkCanE ;
   private java.math.BigDecimal AV17CCStkCanS ;
   private java.math.BigDecimal AV23CCStkPre ;
   private java.math.BigDecimal AV38Exis ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal AV32ComprasInv ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV33ConsumosInv ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV53RecExiRcc ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV54RecExiRea ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV55RecExiTcc ;
   private java.math.BigDecimal AV56Recexiteo ;
   private java.math.BigDecimal AV49PrdExialm ;
   private java.math.BigDecimal AV48PrdCanres ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV35Emprcod ;
   private String AV51Prdnum ;
   private String AV50PrdNom ;
   private String AV34DiaHora ;
   private String AV61TipMovCc ;
   private String AV18CCStkDsc ;
   private String AV22CCStkLot ;
   private String AV44Hdr ;
   private String AV14CCstkusu ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A3345TipMovCc ;
   private String A3357CCStkDsc ;
   private String A5722CCStkLot ;
   private String A3352CCStkPar ;
   private String A3355CCStkUsu ;
   private String A3356CCStkHor ;
   private String AV9CCStkHor ;
   private String AV11CCStkpar ;
   private String GXt_char2 ;
   private String AV73TipMovCcIN ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date AV19CCstkfec ;
   private java.util.Date AV20CCstkfec_to ;
   private java.util.Date AV74CCStkLotFech ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date A13979CCStkLotFe ;
   private java.util.Date AV15Recfec ;
   private java.util.Date A810RecFec ;
   private java.util.Date GXv_date5[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV60TextFileLine ;
   private String AV28ColumnsSelectorXML ;
   private String AV62UserCustomValue ;
   private String AV40Filename ;
   private String AV37ErrorMessage ;
   private com.genexus.webpanels.WebSession AV58Session ;
   private com.genexus.util.GXFile AV59TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09GO2_A396EmprCod ;
   private String[] P09GO2_A719PrdNum ;
   private String[] P09GO2_A3345TipMovCc ;
   private java.util.Date[] P09GO2_A3348CCStkFec ;
   private String[] P09GO2_A3357CCStkDsc ;
   private long[] P09GO2_A3342CCStkLin ;
   private java.math.BigDecimal[] P09GO2_A3349CCStkPre ;
   private java.math.BigDecimal[] P09GO2_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09GO2_A3344CCStkCanS ;
   private String[] P09GO2_A5722CCStkLot ;
   private String[] P09GO2_A3352CCStkPar ;
   private byte[] P09GO2_A3351CCStkReo ;
   private int[] P09GO2_A3350CCStkBar ;
   private short[] P09GO2_A3358CCStkLen ;
   private int[] P09GO2_A3353CCStkPed ;
   private String[] P09GO2_A3355CCStkUsu ;
   private java.util.Date[] P09GO2_A13979CCStkLotFe ;
   private String[] P09GO2_A3356CCStkHor ;
   private java.util.Date[] P09GO3_A810RecFec ;
   private String[] P09GO3_A719PrdNum ;
   private String[] P09GO3_A396EmprCod ;
   private java.math.BigDecimal[] P09GO3_A809RecExiTeo ;
   private java.math.BigDecimal[] P09GO3_A807RecExiRea ;
   private java.math.BigDecimal[] P09GO3_A808RecExiTcc ;
   private java.math.BigDecimal[] P09GO3_A806RecExiRcc ;
   private com.genexus.internet.HttpResponse AV45HttpResponse ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV64WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class upq_cuentacorriente_exportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09GO2", "SELECT EmprCod, PrdNum, TipMovCc, CCStkFec, CCStkDsc, CCStkLin, CCStkPre, CCStkCanE, CCStkCanS, CCStkLot, CCStkPar, CCStkReo, CCStkBar, CCStkLen, CCStkPed, CCStkUsu, CCStkLotFe, CCStkHor FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ? and CCStkFec >= ?) AND (TipMovCc <> 'EC') AND (CCStkFec <= ?) ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GO3", "SELECT RecFec, PrdNum, EmprCod, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 8);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

