package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pcccnrp2 extends GXReportText
{
   public pcccnrp2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcccnrp2.class ), "" );
   }

   public pcccnrp2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             short[] aP3 ,
                             short[] aP4 )
   {
      pcccnrp2.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        short[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             short[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      pcccnrp2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcccnrp2.this.AV16Clicod1 = aP1[0];
      this.aP1 = aP1;
      pcccnrp2.this.AV17Clicod2 = aP2[0];
      this.aP2 = aP2;
      pcccnrp2.this.AV18Tb1_cod1 = aP3[0];
      this.aP3 = aP3;
      pcccnrp2.this.AV19Tb1_cod2 = aP4[0];
      this.aP4 = aP4;
      pcccnrp2.this.AV8Archivo = aP5[0];
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
         setOutput( "pcccnrp2.prn" );
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
      /* Using cursor P04UL2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A407EmprNom = P04UL2_A407EmprNom[0] ;
         n407EmprNom = P04UL2_n407EmprNom[0] ;
         AV10EmprNom = A407EmprNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      h4UL0( false, 0) ;
      out.print( "" + "<TABLE>" );
      ToSkip = 1 ;
      h4UL0( false, 0) ;
      out.print( "" + "<TR>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "<table border=\"1\">", "") + AV10EmprNom ;
      h4UL0( false, 0) ;
      out.print( "" + localUtil.format( AV9Texto, "") );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "<td colspan=\"13\" align=\"center\" BGCOLOR=\"FFFF00\"/>", "") + AV23Pgmdesc ;
      h4UL0( false, 0) ;
      out.print( "" + localUtil.format( AV9Texto, "") );
      ToSkip = 1 ;
      h4UL0( false, 0) ;
      out.print( "" + "</TR>" );
      ToSkip = 1 ;
      h4UL0( false, 0) ;
      out.print( "" + "<TR>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "Cliente", "") ;
      h4UL0( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "Nombre", "") ;
      h4UL0( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "Cuardeno", "") ;
      h4UL0( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "T Articulo", "") ;
      h4UL0( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "Intensidad", "") ;
      h4UL0( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "Control", "") ;
      h4UL0( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "Descripcion", "") ;
      h4UL0( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "Minimo", "") ;
      h4UL0( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "Maximo", "") ;
      h4UL0( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "PMM", "") ;
      h4UL0( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "Norma", "") ;
      h4UL0( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "Condiciones Ensayo", "") ;
      h4UL0( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      AV9Texto = httpContext.getMessage( "Observaciones", "") ;
      h4UL0( false, 0) ;
      out.print( "" + "<TD><STRONG><FONT face=Arial color=#000000>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
      ToSkip = 1 ;
      h4UL0( false, 0) ;
      out.print( "" + "</TR>" );
      ToSkip = 1 ;
      /* Using cursor P04UL3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16Clicod1), Short.valueOf(AV18Tb1_cod1), Short.valueOf(AV19Tb1_cod2), Integer.valueOf(AV17Clicod2)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A9713Tb1_Cod = P04UL3_A9713Tb1_Cod[0] ;
         A252CliCod = P04UL3_A252CliCod[0] ;
         A279CliNom = P04UL3_A279CliNom[0] ;
         A9715Tb1_Dsc = P04UL3_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = P04UL3_n9715Tb1_Dsc[0] ;
         A4036CCTDsc = P04UL3_A4036CCTDsc[0] ;
         A4043CCTLinDsc = P04UL3_A4043CCTLinDsc[0] ;
         A11740CCSCMn = P04UL3_A11740CCSCMn[0] ;
         n11740CCSCMn = P04UL3_n11740CCSCMn[0] ;
         A11741CCSCMx = P04UL3_A11741CCSCMx[0] ;
         n11741CCSCMx = P04UL3_n11741CCSCMx[0] ;
         A11754CCSCPmm = P04UL3_A11754CCSCPmm[0] ;
         n11754CCSCPmm = P04UL3_n11754CCSCPmm[0] ;
         A11751CCSCNorma = P04UL3_A11751CCSCNorma[0] ;
         n11751CCSCNorma = P04UL3_n11751CCSCNorma[0] ;
         A11755CCSCCEns = P04UL3_A11755CCSCCEns[0] ;
         n11755CCSCCEns = P04UL3_n11755CCSCCEns[0] ;
         A11756CCSCObs2 = P04UL3_A11756CCSCObs2[0] ;
         n11756CCSCObs2 = P04UL3_n11756CCSCObs2[0] ;
         A4034CCTLin = P04UL3_A4034CCTLin[0] ;
         A4031CCTCod = P04UL3_A4031CCTCod[0] ;
         A11749CCCTc = P04UL3_A11749CCCTc[0] ;
         A11738CCColNum = P04UL3_A11738CCColNum[0] ;
         A11737CCColNom = P04UL3_A11737CCColNom[0] ;
         A11736CCArtCod = P04UL3_A11736CCArtCod[0] ;
         A11750IntId = P04UL3_A11750IntId[0] ;
         A11748TipArtiId = P04UL3_A11748TipArtiId[0] ;
         A279CliNom = P04UL3_A279CliNom[0] ;
         A4036CCTDsc = P04UL3_A4036CCTDsc[0] ;
         A4043CCTLinDsc = P04UL3_A4043CCTLinDsc[0] ;
         A9715Tb1_Dsc = P04UL3_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = P04UL3_n9715Tb1_Dsc[0] ;
         GXt_char1 = A11747IntDs ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = (byte)(A11750IntId) ;
         GXv_char4[0] = GXt_char1 ;
         new app.pdscint(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
         pcccnrp2.this.A396EmprCod = GXv_char2[0] ;
         pcccnrp2.this.A11750IntId = GXv_int3[0] ;
         pcccnrp2.this.GXt_char1 = GXv_char4[0] ;
         A11747IntDs = GXt_char1 ;
         GXt_char1 = A11746TipArtiDs ;
         GXv_char4[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A11748TipArtiId, GXv_char4) ;
         pcccnrp2.this.GXt_char1 = GXv_char4[0] ;
         A11746TipArtiDs = GXt_char1 ;
         h4UL0( false, 0) ;
         out.print( "" + "<TR>" );
         ToSkip = 1 ;
         AV9Texto = GXutil.str( A252CliCod, 6, 0) ;
         h4UL0( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         AV9Texto = A279CliNom ;
         h4UL0( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         AV9Texto = A9715Tb1_Dsc ;
         h4UL0( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         AV9Texto = A11746TipArtiDs ;
         h4UL0( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         AV9Texto = A11747IntDs ;
         h4UL0( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         AV9Texto = A4036CCTDsc ;
         h4UL0( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         AV9Texto = A4043CCTLinDsc ;
         h4UL0( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         AV9Texto = "´" + GXutil.trim( A11740CCSCMn) ;
         h4UL0( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         AV9Texto = "´" + GXutil.trim( A11741CCSCMx) ;
         h4UL0( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         AV9Texto = A11754CCSCPmm ;
         h4UL0( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         AV9Texto = A11751CCSCNorma ;
         h4UL0( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         AV9Texto = A11755CCSCCEns ;
         h4UL0( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         AV9Texto = A11756CCSCObs2 ;
         h4UL0( false, 0) ;
         out.print( "" + "<TD><FONT face=Arial>" + "" + localUtil.format( AV9Texto, "") + "" + "</TD>" );
         ToSkip = 1 ;
         h4UL0( false, 0) ;
         out.print( "" + "</TR>" );
         ToSkip = 1 ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      h4UL0( false, 0) ;
      out.print( "" + "</TABLE>" );
      /* Print footer for last page */
      ToSkip = (int)(P_lines+1) ;
      h4UL0( true, 0) ;
      /* Close printer file */
      /* Close text printer */
      out.close();
      cleanup();
   }

   public void h4UL0( boolean bFoot ,
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
      this.aP0[0] = pcccnrp2.this.A396EmprCod;
      this.aP1[0] = pcccnrp2.this.AV16Clicod1;
      this.aP2[0] = pcccnrp2.this.AV17Clicod2;
      this.aP3[0] = pcccnrp2.this.AV18Tb1_cod1;
      this.aP4[0] = pcccnrp2.this.AV19Tb1_cod2;
      this.aP5[0] = pcccnrp2.this.AV8Archivo;
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
      P04UL2_A396EmprCod = new String[] {""} ;
      P04UL2_A407EmprNom = new String[] {""} ;
      P04UL2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV10EmprNom = "" ;
      AV9Texto = "" ;
      AV23Pgmdesc = "" ;
      P04UL3_A9713Tb1_Cod = new short[1] ;
      P04UL3_A252CliCod = new int[1] ;
      P04UL3_A279CliNom = new String[] {""} ;
      P04UL3_A9715Tb1_Dsc = new String[] {""} ;
      P04UL3_n9715Tb1_Dsc = new boolean[] {false} ;
      P04UL3_A4036CCTDsc = new String[] {""} ;
      P04UL3_A4043CCTLinDsc = new String[] {""} ;
      P04UL3_A11740CCSCMn = new String[] {""} ;
      P04UL3_n11740CCSCMn = new boolean[] {false} ;
      P04UL3_A11741CCSCMx = new String[] {""} ;
      P04UL3_n11741CCSCMx = new boolean[] {false} ;
      P04UL3_A11754CCSCPmm = new String[] {""} ;
      P04UL3_n11754CCSCPmm = new boolean[] {false} ;
      P04UL3_A11751CCSCNorma = new String[] {""} ;
      P04UL3_n11751CCSCNorma = new boolean[] {false} ;
      P04UL3_A11755CCSCCEns = new String[] {""} ;
      P04UL3_n11755CCSCCEns = new boolean[] {false} ;
      P04UL3_A11756CCSCObs2 = new String[] {""} ;
      P04UL3_n11756CCSCObs2 = new boolean[] {false} ;
      P04UL3_A4034CCTLin = new short[1] ;
      P04UL3_A4031CCTCod = new int[1] ;
      P04UL3_A11749CCCTc = new byte[1] ;
      P04UL3_A11738CCColNum = new int[1] ;
      P04UL3_A11737CCColNom = new String[] {""} ;
      P04UL3_A11736CCArtCod = new String[] {""} ;
      P04UL3_A396EmprCod = new String[] {""} ;
      P04UL3_A11750IntId = new short[1] ;
      P04UL3_A11748TipArtiId = new short[1] ;
      A279CliNom = "" ;
      A9715Tb1_Dsc = "" ;
      A4036CCTDsc = "" ;
      A4043CCTLinDsc = "" ;
      A11740CCSCMn = "" ;
      A11741CCSCMx = "" ;
      A11754CCSCPmm = "" ;
      A11751CCSCNorma = "" ;
      A11755CCSCCEns = "" ;
      A11756CCSCObs2 = "" ;
      A11737CCColNom = "" ;
      A11736CCArtCod = "" ;
      A11747IntDs = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new byte[1] ;
      A11746TipArtiDs = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcccnrp2__default(),
         new Object[] {
             new Object[] {
            P04UL2_A396EmprCod, P04UL2_A407EmprNom, P04UL2_n407EmprNom
            }
            , new Object[] {
            P04UL3_A9713Tb1_Cod, P04UL3_A252CliCod, P04UL3_A279CliNom, P04UL3_A9715Tb1_Dsc, P04UL3_n9715Tb1_Dsc, P04UL3_A4036CCTDsc, P04UL3_A4043CCTLinDsc, P04UL3_A11740CCSCMn, P04UL3_n11740CCSCMn, P04UL3_A11741CCSCMx,
            P04UL3_n11741CCSCMx, P04UL3_A11754CCSCPmm, P04UL3_n11754CCSCPmm, P04UL3_A11751CCSCNorma, P04UL3_n11751CCSCNorma, P04UL3_A11755CCSCCEns, P04UL3_n11755CCSCCEns, P04UL3_A11756CCSCObs2, P04UL3_n11756CCSCObs2, P04UL3_A4034CCTLin,
            P04UL3_A4031CCTCod, P04UL3_A11749CCCTc, P04UL3_A11738CCColNum, P04UL3_A11737CCColNom, P04UL3_A11736CCArtCod, P04UL3_A396EmprCod, P04UL3_A11750IntId, P04UL3_A11748TipArtiId
            }
         }
      );
      AV23Pgmdesc = httpContext.getMessage( "Informe Valores Estandars", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV23Pgmdesc = httpContext.getMessage( "Informe Valores Estandars", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A11749CCCTc ;
   private byte GXv_int3[] ;
   private short AV18Tb1_cod1 ;
   private short AV19Tb1_cod2 ;
   private short A9713Tb1_Cod ;
   private short A4034CCTLin ;
   private short A11750IntId ;
   private short A11748TipArtiId ;
   private short Gx_err ;
   private int AV16Clicod1 ;
   private int AV17Clicod2 ;
   private int M_top ;
   private int M_bot ;
   private int P_lines ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_line ;
   private int A252CliCod ;
   private int A4031CCTCod ;
   private int A11738CCColNum ;
   private int Gx_page ;
   private String A396EmprCod ;
   private String AV8Archivo ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV10EmprNom ;
   private String AV9Texto ;
   private String AV23Pgmdesc ;
   private String A279CliNom ;
   private String A9715Tb1_Dsc ;
   private String A4036CCTDsc ;
   private String A4043CCTLinDsc ;
   private String A11740CCSCMn ;
   private String A11741CCSCMx ;
   private String A11754CCSCPmm ;
   private String A11751CCSCNorma ;
   private String A11755CCSCCEns ;
   private String A11756CCSCObs2 ;
   private String A11737CCColNom ;
   private String A11736CCArtCod ;
   private String A11747IntDs ;
   private String GXv_char2[] ;
   private String A11746TipArtiDs ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private boolean n407EmprNom ;
   private boolean n9715Tb1_Dsc ;
   private boolean n11740CCSCMn ;
   private boolean n11741CCSCMx ;
   private boolean n11754CCSCPmm ;
   private boolean n11751CCSCNorma ;
   private boolean n11755CCSCCEns ;
   private boolean n11756CCSCObs2 ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private short[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04UL2_A396EmprCod ;
   private String[] P04UL2_A407EmprNom ;
   private boolean[] P04UL2_n407EmprNom ;
   private short[] P04UL3_A9713Tb1_Cod ;
   private int[] P04UL3_A252CliCod ;
   private String[] P04UL3_A279CliNom ;
   private String[] P04UL3_A9715Tb1_Dsc ;
   private boolean[] P04UL3_n9715Tb1_Dsc ;
   private String[] P04UL3_A4036CCTDsc ;
   private String[] P04UL3_A4043CCTLinDsc ;
   private String[] P04UL3_A11740CCSCMn ;
   private boolean[] P04UL3_n11740CCSCMn ;
   private String[] P04UL3_A11741CCSCMx ;
   private boolean[] P04UL3_n11741CCSCMx ;
   private String[] P04UL3_A11754CCSCPmm ;
   private boolean[] P04UL3_n11754CCSCPmm ;
   private String[] P04UL3_A11751CCSCNorma ;
   private boolean[] P04UL3_n11751CCSCNorma ;
   private String[] P04UL3_A11755CCSCCEns ;
   private boolean[] P04UL3_n11755CCSCCEns ;
   private String[] P04UL3_A11756CCSCObs2 ;
   private boolean[] P04UL3_n11756CCSCObs2 ;
   private short[] P04UL3_A4034CCTLin ;
   private int[] P04UL3_A4031CCTCod ;
   private byte[] P04UL3_A11749CCCTc ;
   private int[] P04UL3_A11738CCColNum ;
   private String[] P04UL3_A11737CCColNom ;
   private String[] P04UL3_A11736CCArtCod ;
   private String[] P04UL3_A396EmprCod ;
   private short[] P04UL3_A11750IntId ;
   private short[] P04UL3_A11748TipArtiId ;
}

final  class pcccnrp2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04UL2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04UL3", "SELECT T1.Tb1_Cod, T1.CliCod, T2.CliNom, T5.Tb1_Dsc, T3.CCTDsc, T4.CCTLinDsc, T1.CCSCMn, T1.CCSCMx, T1.CCSCPmm, T1.CCSCNorma, T1.CCSCCEns, T1.CCSCObs2, T1.CCTLin, T1.CCTCod, T1.CCCTc, T1.CCColNum, T1.CCColNom, T1.CCArtCod, T1.EmprCod, T1.IntId, T1.TipArtiId FROM ((((TXPCCCNOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPCCDef T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod) INNER JOIN TXPCCDef1 T4 ON T4.EmprCod = T1.EmprCod AND T4.CCTCod = T1.CCTCod AND T4.CCTLin = T1.CCTLin) INNER JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.Tb1_Cod) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.Tb1_Cod >= ?) AND (T1.Tb1_Cod <= ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.Tb1_Cod, T1.CCArtCod, T1.TipArtiId, T1.CCColNom, T1.CCColNum, T1.CCCTc, T1.IntId, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 100);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 60);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(13);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((byte[]) buf[21])[0] = rslt.getByte(15);
               ((int[]) buf[22])[0] = rslt.getInt(16);
               ((String[]) buf[23])[0] = rslt.getString(17, 13);
               ((String[]) buf[24])[0] = rslt.getString(18, 16);
               ((String[]) buf[25])[0] = rslt.getString(19, 3);
               ((short[]) buf[26])[0] = rslt.getShort(20);
               ((short[]) buf[27])[0] = rslt.getShort(21);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

