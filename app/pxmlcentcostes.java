package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pxmlcentcostes extends GXReportText
{
   public pxmlcentcostes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pxmlcentcostes.class ), "" );
   }

   public pxmlcentcostes( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             short[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 )
   {
      pxmlcentcostes.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        short[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             short[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 )
   {
      pxmlcentcostes.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pxmlcentcostes.this.AV24PCcoco = aP1[0];
      this.aP1 = aP1;
      pxmlcentcostes.this.AV30UCcoco = aP2[0];
      this.aP2 = aP2;
      pxmlcentcostes.this.AV25PFecha = aP3[0];
      this.aP3 = aP3;
      pxmlcentcostes.this.AV31UFecha = aP4[0];
      this.aP4 = aP4;
      pxmlcentcostes.this.AV8Archivo = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      Gx_line = (int)(P_lines+1) ;
      Gx_out = "FIL" ;
      if ( GXutil.strcmp(Gx_out, "PRN") == 0 )
      {
         setOutput( "pxmlcentcostes.prn" );
      }
      else
      {
         if ( GXutil.strcmp(Gx_out, "SCR") == 0 )
         {
            setOutput(System.out);
         }
         else
         {
            if ( GXutil.strcmp(Gx_out, "FIL") == 0 )
            {
               setOutput( AV8Archivo );
            }
         }
      }
      /* Using cursor P04V12 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A407EmprNom = P04V12_A407EmprNom[0] ;
         n407EmprNom = P04V12_n407EmprNom[0] ;
         AV10EmprNom = A407EmprNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      h4V10( false, 0) ;
      out.print( "" + "<TABLE>" );
      ToSkip = 1 ;
      h4V10( false, 0) ;
      out.print( "" + "<TR>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "<table border=\"1\">", "") ;
      h4V10( false, 0) ;
      out.print( "" + localUtil.format( AV9Texto, "") );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "<td colspan=\"6\" align=\"center\" BGCOLOR=\"FFFF00\"/>", "") + " " + AV35Pgmdesc + httpContext.getMessage( " Periodo ", "") + localUtil.dtoc( AV25PFecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " hasta ", "") + localUtil.dtoc( AV31UFecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + "    " + AV10EmprNom ;
      h4V10( false, 0) ;
      out.print( "" + localUtil.format( AV9Texto, "") );
      ToSkip = 1 ;
      h4V10( false, 0) ;
      out.print( "" + "</TR>" );
      ToSkip = 1 ;
      h4V10( false, 0) ;
      out.print( "" + "<TR>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "Centro", "") ;
      h4V10( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "Descripcion", "") ;
      h4V10( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "Producto", "") ;
      h4V10( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "Descripcion", "") ;
      h4V10( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "Cantidad", "") ;
      h4V10( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "Valor", "") ;
      h4V10( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      h4V10( false, 0) ;
      out.print( "" + "</TR>" );
      ToSkip = 1 ;
      AV27Total_sg = DecimalUtil.doubleToDec(0) ;
      AV29Total_vg = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P04V13 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(AV24PCcoco), AV25PFecha, AV31UFecha, Short.valueOf(AV30UCcoco)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk4V13 = false ;
         A3344CCStkCanS = P04V13_A3344CCStkCanS[0] ;
         A3349CCStkPre = P04V13_A3349CCStkPre[0] ;
         A3345TipMovCc = P04V13_A3345TipMovCc[0] ;
         A3348CCStkFec = P04V13_A3348CCStkFec[0] ;
         A3839CcoCod = P04V13_A3839CcoCod[0] ;
         A3840CcoDsc = P04V13_A3840CcoDsc[0] ;
         n3840CcoDsc = P04V13_n3840CcoDsc[0] ;
         A718PrdNom = P04V13_A718PrdNom[0] ;
         A719PrdNum = P04V13_A719PrdNum[0] ;
         A3343CCStkCanE = P04V13_A3343CCStkCanE[0] ;
         A3342CCStkLin = P04V13_A3342CCStkLin[0] ;
         A3840CcoDsc = P04V13_A3840CcoDsc[0] ;
         n3840CcoDsc = P04V13_n3840CcoDsc[0] ;
         A718PrdNom = P04V13_A718PrdNom[0] ;
         if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "PP", "")) == 0 ) )
         {
            AV21F_cab = (byte)(0) ;
            AV26Total_s = DecimalUtil.doubleToDec(0) ;
            AV28Total_v = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P04V13_A396EmprCod[0], A396EmprCod) == 0 ) && ( P04V13_A3839CcoCod[0] == A3839CcoCod ) )
            {
               brk4V13 = false ;
               A3344CCStkCanS = P04V13_A3344CCStkCanS[0] ;
               A3349CCStkPre = P04V13_A3349CCStkPre[0] ;
               A3345TipMovCc = P04V13_A3345TipMovCc[0] ;
               A3348CCStkFec = P04V13_A3348CCStkFec[0] ;
               A3840CcoDsc = P04V13_A3840CcoDsc[0] ;
               n3840CcoDsc = P04V13_n3840CcoDsc[0] ;
               A718PrdNom = P04V13_A718PrdNom[0] ;
               A719PrdNum = P04V13_A719PrdNum[0] ;
               A3342CCStkLin = P04V13_A3342CCStkLin[0] ;
               A3840CcoDsc = P04V13_A3840CcoDsc[0] ;
               n3840CcoDsc = P04V13_n3840CcoDsc[0] ;
               A718PrdNom = P04V13_A718PrdNom[0] ;
               if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "PP", "")) == 0 ) )
               {
                  if ( (( GXutil.resetTime(A3348CCStkFec).after( GXutil.resetTime( AV25PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A3348CCStkFec), GXutil.resetTime(AV25PFecha)) )) && (( GXutil.resetTime(A3348CCStkFec).before( GXutil.resetTime( AV31UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A3348CCStkFec), GXutil.resetTime(AV31UFecha)) )) )
                  {
                     AV18CCSTKCANS = DecimalUtil.doubleToDec(0) ;
                     AV19Valors = DecimalUtil.doubleToDec(0) ;
                     while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P04V13_A396EmprCod[0], A396EmprCod) == 0 ) && ( P04V13_A3839CcoCod[0] == A3839CcoCod ) && ( GXutil.strcmp(P04V13_A719PrdNum[0], A719PrdNum) == 0 ) )
                     {
                        brk4V13 = false ;
                        A3344CCStkCanS = P04V13_A3344CCStkCanS[0] ;
                        A3349CCStkPre = P04V13_A3349CCStkPre[0] ;
                        A3345TipMovCc = P04V13_A3345TipMovCc[0] ;
                        A3348CCStkFec = P04V13_A3348CCStkFec[0] ;
                        A3342CCStkLin = P04V13_A3342CCStkLin[0] ;
                        if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "PP", "")) == 0 ) )
                        {
                           if ( (( GXutil.resetTime(A3348CCStkFec).after( GXutil.resetTime( AV25PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A3348CCStkFec), GXutil.resetTime(AV25PFecha)) )) && (( GXutil.resetTime(A3348CCStkFec).before( GXutil.resetTime( AV31UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A3348CCStkFec), GXutil.resetTime(AV31UFecha)) )) )
                           {
                              AV18CCSTKCANS = AV18CCSTKCANS.add(A3344CCStkCanS) ;
                              AV19Valors = AV19Valors.add((GXutil.roundDecimal( A3344CCStkCanS.multiply(A3349CCStkPre), 2))) ;
                           }
                        }
                        brk4V13 = true ;
                        pr_default.readNext(1);
                     }
                     h4V10( false, 0) ;
                     out.print( "" + "<TR>" );
                     ToSkip = 1 ;
                     AV9Texto = GXutil.str( A3839CcoCod, 3, 0) ;
                     h4V10( false, 0) ;
                     out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
                     ToSkip = 1 ;
                     AV9Texto = A3840CcoDsc ;
                     h4V10( false, 0) ;
                     out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
                     ToSkip = 1 ;
                     AV9Texto = A719PrdNum ;
                     h4V10( false, 0) ;
                     out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
                     ToSkip = 1 ;
                     AV9Texto = A718PrdNom ;
                     h4V10( false, 0) ;
                     out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
                     ToSkip = 1 ;
                     AV9Texto = GXutil.str( AV18CCSTKCANS, 14, 4) ;
                     h4V10( false, 0) ;
                     out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
                     ToSkip = 1 ;
                     AV9Texto = GXutil.str( AV19Valors, 14, 2) ;
                     h4V10( false, 0) ;
                     out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
                     ToSkip = 1 ;
                     h4V10( false, 0) ;
                     out.print( "" + "</TR>" );
                     ToSkip = 1 ;
                     AV26Total_s = AV26Total_s.add(AV18CCSTKCANS) ;
                     AV28Total_v = AV28Total_v.add(AV19Valors) ;
                     AV27Total_sg = AV27Total_sg.add(AV18CCSTKCANS) ;
                     AV29Total_vg = AV29Total_vg.add(AV19Valors) ;
                  }
               }
               if ( ! brk4V13 )
               {
                  brk4V13 = true ;
                  pr_default.readNext(1);
               }
            }
            if ( ( AV26Total_s.doubleValue() == 0 ) && ( AV28Total_v.doubleValue() == 0 ) )
            {
            }
            else
            {
               h4V10( false, 0) ;
               out.print( "" + "<TR>" );
               ToSkip = 1 ;
               AV9Texto = " " ;
               h4V10( false, 0) ;
               out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
               ToSkip = 1 ;
               h4V10( false, 0) ;
               out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
               ToSkip = 1 ;
               h4V10( false, 0) ;
               out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
               ToSkip = 1 ;
               h4V10( false, 0) ;
               out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
               ToSkip = 1 ;
               AV9Texto = GXutil.str( AV26Total_s, 14, 4) ;
               h4V10( false, 0) ;
               out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
               ToSkip = 1 ;
               AV9Texto = GXutil.str( AV28Total_v, 14, 2) ;
               h4V10( false, 0) ;
               out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
               ToSkip = 1 ;
               h4V10( false, 0) ;
               out.print( "" + "</TR>" );
               ToSkip = 1 ;
            }
         }
         if ( ! brk4V13 )
         {
            brk4V13 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
      if ( ( AV27Total_sg.doubleValue() == 0 ) && ( AV29Total_vg.doubleValue() == 0 ) )
      {
      }
      else
      {
         h4V10( false, 0) ;
         out.print( "" + "<TR>" );
         ToSkip = 1 ;
         AV9Texto = " " ;
         h4V10( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         h4V10( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         h4V10( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         h4V10( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         AV9Texto = GXutil.str( AV27Total_sg, 14, 4) ;
         h4V10( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         AV9Texto = GXutil.str( AV29Total_vg, 14, 2) ;
         h4V10( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         h4V10( false, 0) ;
         out.print( "" + "</TR>" );
         ToSkip = 1 ;
      }
      h4V10( false, 0) ;
      out.print( "" + "</TABLE>" );
      /* Print footer for last page */
      ToSkip = (int)(P_lines+1) ;
      h4V10( true, 0) ;
      /* Close printer file */
      /* Close text printer */
      out.close();
      cleanup();
   }

   public void h4V10( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               out.print("\f");
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top)) ;
            /* Print headers */
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            out.print( "\n" );
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pxmlcentcostes.this.A396EmprCod;
      this.aP1[0] = pxmlcentcostes.this.AV24PCcoco;
      this.aP2[0] = pxmlcentcostes.this.AV30UCcoco;
      this.aP3[0] = pxmlcentcostes.this.AV25PFecha;
      this.aP4[0] = pxmlcentcostes.this.AV31UFecha;
      this.aP5[0] = pxmlcentcostes.this.AV8Archivo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P04V12_A396EmprCod = new String[] {""} ;
      P04V12_A407EmprNom = new String[] {""} ;
      P04V12_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV10EmprNom = "" ;
      AV9Texto = "" ;
      AV35Pgmdesc = "" ;
      AV27Total_sg = DecimalUtil.ZERO ;
      AV29Total_vg = DecimalUtil.ZERO ;
      P04V13_A396EmprCod = new String[] {""} ;
      P04V13_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V13_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V13_A3345TipMovCc = new String[] {""} ;
      P04V13_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04V13_A3839CcoCod = new short[1] ;
      P04V13_A3840CcoDsc = new String[] {""} ;
      P04V13_n3840CcoDsc = new boolean[] {false} ;
      P04V13_A718PrdNom = new String[] {""} ;
      P04V13_A719PrdNum = new String[] {""} ;
      P04V13_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04V13_A3342CCStkLin = new long[1] ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3345TipMovCc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3840CcoDsc = "" ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      AV26Total_s = DecimalUtil.ZERO ;
      AV28Total_v = DecimalUtil.ZERO ;
      AV18CCSTKCANS = DecimalUtil.ZERO ;
      AV19Valors = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pxmlcentcostes__default(),
         new Object[] {
             new Object[] {
            P04V12_A396EmprCod, P04V12_A407EmprNom, P04V12_n407EmprNom
            }
            , new Object[] {
            P04V13_A396EmprCod, P04V13_A3344CCStkCanS, P04V13_A3349CCStkPre, P04V13_A3345TipMovCc, P04V13_A3348CCStkFec, P04V13_A3839CcoCod, P04V13_A3840CcoDsc, P04V13_n3840CcoDsc, P04V13_A718PrdNom, P04V13_A719PrdNum,
            P04V13_A3343CCStkCanE, P04V13_A3342CCStkLin
            }
         }
      );
      AV35Pgmdesc = httpContext.getMessage( "Informe Centro Costes", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV35Pgmdesc = httpContext.getMessage( "Informe Centro Costes", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV21F_cab ;
   private short AV24PCcoco ;
   private short AV30UCcoco ;
   private short A3839CcoCod ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int P_lines ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_line ;
   private int Gx_page ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV27Total_sg ;
   private java.math.BigDecimal AV29Total_vg ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal AV26Total_s ;
   private java.math.BigDecimal AV28Total_v ;
   private java.math.BigDecimal AV18CCSTKCANS ;
   private java.math.BigDecimal AV19Valors ;
   private String A396EmprCod ;
   private String AV8Archivo ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV10EmprNom ;
   private String AV9Texto ;
   private String AV35Pgmdesc ;
   private String A3345TipMovCc ;
   private String A3840CcoDsc ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private java.util.Date AV25PFecha ;
   private java.util.Date AV31UFecha ;
   private java.util.Date A3348CCStkFec ;
   private boolean n407EmprNom ;
   private boolean brk4V13 ;
   private boolean n3840CcoDsc ;
   private String[] aP5 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private short[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04V12_A396EmprCod ;
   private String[] P04V12_A407EmprNom ;
   private boolean[] P04V12_n407EmprNom ;
   private String[] P04V13_A396EmprCod ;
   private java.math.BigDecimal[] P04V13_A3344CCStkCanS ;
   private java.math.BigDecimal[] P04V13_A3349CCStkPre ;
   private String[] P04V13_A3345TipMovCc ;
   private java.util.Date[] P04V13_A3348CCStkFec ;
   private short[] P04V13_A3839CcoCod ;
   private String[] P04V13_A3840CcoDsc ;
   private boolean[] P04V13_n3840CcoDsc ;
   private String[] P04V13_A718PrdNom ;
   private String[] P04V13_A719PrdNum ;
   private java.math.BigDecimal[] P04V13_A3343CCStkCanE ;
   private long[] P04V13_A3342CCStkLin ;
}

final  class pxmlcentcostes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04V12", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04V13", "SELECT T1.EmprCod, T1.CCStkCanS, T1.CCStkPre, T1.TipMovCc, T1.CCStkFec, T1.CcoCod, T2.CcoDsc, T3.PrdNom, T1.PrdNum, T1.CCStkCanE, T1.CCStkLin FROM ((TXPCCSTKS T1 INNER JOIN TXPCENTCO T2 ON T2.CcoCod = T1.CcoCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.CcoCod >= ?) AND (T1.CCStkFec >= ? and T1.CCStkFec <= ?) AND (T1.CcoCod <= ?) ORDER BY T1.EmprCod, T1.CcoCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((long[]) buf[11])[0] = rslt.getLong(11);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

