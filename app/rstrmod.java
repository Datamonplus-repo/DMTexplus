package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rstrmod extends GXReportText
{
   public rstrmod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rstrmod.class ), "" );
   }

   public rstrmod( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      rstrmod.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      rstrmod.this.A1115ModSCod = aP0[0];
      this.aP0 = aP0;
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
         setOutput( "rstrmod.prn" );
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
               setOutput( "rstrmod.prn" );
            }
         }
      }
      GXt_char1 = AV15Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2137_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit0 = GXt_char1 ;
      GXt_char1 = AV16Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit1 = GXt_char1 ;
      GXt_char1 = AV17Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit2 = GXt_char1 ;
      GXt_char1 = AV18Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit3 = GXt_char1 ;
      GXt_char1 = AV19Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2294_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit4 = GXt_char1 ;
      GXt_char1 = AV20Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2326_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit5 = GXt_char1 ;
      GXt_char1 = AV21Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1040_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit6 = GXt_char1 ;
      GXt_char1 = AV22Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2180_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit7 = GXt_char1 ;
      GXt_char1 = AV23Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2321_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit8 = GXt_char1 ;
      GXt_char1 = AV24Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1375_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit9 = GXt_char1 ;
      GXt_char1 = AV25Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2272_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV25Lit10 = GXt_char1 ;
      GXt_char1 = AV26Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1074_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV26Lit11 = GXt_char1 ;
      GXt_char1 = AV27Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1355_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV27Lit12 = GXt_char1 ;
      GXt_char1 = AV28Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2113_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit13 = GXt_char1 ;
      GXt_char1 = AV29Lit14 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2463_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV29Lit14 = GXt_char1 ;
      GXt_char1 = AV30Lit15 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2472_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV30Lit15 = GXt_char1 ;
      GXt_char1 = AV31Lit16 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN387_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV31Lit16 = GXt_char1 ;
      GXt_char1 = AV32Lit17 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN386_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit17 = GXt_char1 ;
      GXt_char1 = AV33Lit18 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2113_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV33Lit18 = GXt_char1 ;
      GXt_char1 = AV34Lit19 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2457_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV34Lit19 = GXt_char1 ;
      GXt_char1 = AV35Lit20 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2057_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV35Lit20 = GXt_char1 ;
      GXt_char1 = AV36Lit21 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN748_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV36Lit21 = GXt_char1 ;
      GXt_char1 = AV37Lit22 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN601_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV37Lit22 = GXt_char1 ;
      GXt_char1 = AV38Lit23 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN386_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV38Lit23 = GXt_char1 ;
      GXt_char1 = AV39Lit24 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN386_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV39Lit24 = GXt_char1 ;
      GXt_char1 = AV40Lit25 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN601_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV40Lit25 = GXt_char1 ;
      GXt_char1 = AV41Lit26 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN601_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV41Lit26 = GXt_char1 ;
      GXt_char1 = AV42Lit27 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN601_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV42Lit27 = GXt_char1 ;
      GXt_char1 = AV43Lit28 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2522_", ""), (byte)(99), GXv_char2) ;
      rstrmod.this.GXt_char1 = GXv_char2[0] ;
      AV43Lit28 = GXt_char1 ;
      /* Using cursor P065X2 */
      pr_default.execute(0, new Object[] {A1115ModSCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1116ModSDsc = P065X2_A1116ModSDsc[0] ;
         n1116ModSDsc = P065X2_n1116ModSDsc[0] ;
         h65X0( false, 0) ;
         out.print( "  " + localUtil.format( AV19Lit4, "") + " " + ":" + " " + localUtil.format( A1115ModSCod, "@!") + " " + localUtil.format( A1116ModSDsc, "") );
         ToSkip = 2 ;
         h65X0( false, 0) ;
         out.print( "  " + localUtil.format( AV20Lit5, "") + " " + localUtil.format( AV21Lit6, "") + " " + localUtil.format( AV22Lit7, "") + "        " + localUtil.format( AV23Lit8, "") + "            " + localUtil.format( AV24Lit9, "") + " " + localUtil.format( AV25Lit10, "") + " " + localUtil.format( AV26Lit11, "") );
         ToSkip = 1 ;
         h65X0( false, 0) ;
         out.print( " " + "=========================================================================" );
         ToSkip = 1 ;
         /* Using cursor P065X3 */
         pr_default.execute(1, new Object[] {A1115ModSCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1111ModSAtDec = P065X3_A1111ModSAtDec[0] ;
            n1111ModSAtDec = P065X3_n1111ModSAtDec[0] ;
            A1112ModSAtLon = P065X3_A1112ModSAtLon[0] ;
            n1112ModSAtLon = P065X3_n1112ModSAtLon[0] ;
            A1114ModSAtTip = P065X3_A1114ModSAtTip[0] ;
            n1114ModSAtTip = P065X3_n1114ModSAtTip[0] ;
            A1113ModSAtNom = P065X3_A1113ModSAtNom[0] ;
            n1113ModSAtNom = P065X3_n1113ModSAtNom[0] ;
            A1110ModSAtCod = P065X3_A1110ModSAtCod[0] ;
            n1110ModSAtCod = P065X3_n1110ModSAtCod[0] ;
            A1117ModSLin = P065X3_A1117ModSLin[0] ;
            h65X0( false, 0) ;
            out.print( "  " + localUtil.format( DecimalUtil.doubleToDec(A1117ModSLin), "Z9") + "  " + localUtil.format( A1110ModSAtCod, "") + " " + localUtil.format( A1113ModSAtNom, "") + " " + localUtil.format( A1114ModSAtTip, "@!") + "   " + localUtil.format( DecimalUtil.doubleToDec(A1112ModSAtLon), "Z9") + "  " + localUtil.format( DecimalUtil.doubleToDec(A1111ModSAtDec), "Z9") );
            ToSkip = 1 ;
            h65X0( false, 0) ;
            out.print( "" + " " );
            ToSkip = 1 ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Print footer for last page */
      ToSkip = (int)(P_lines+1) ;
      h65X0( true, 0) ;
      /* Close printer file */
      /* Close text printer */
      out.close();
      cleanup();
   }

   public void h65X0( boolean bFoot ,
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
            out.print( "                                                        " + localUtil.format( AV16Lit1, "") + "" + ":" + " " + localUtil.format( Gx_date, "99/99/99") );
            out.print( "\n" );
            Gx_line = (int)(Gx_line+1) ;
            out.print( "                                                        " + localUtil.format( AV17Lit2, "") + " " + ":" + " " + localUtil.format( Gx_time, "") );
            out.print( "\n" );
            Gx_line = (int)(Gx_line+1) ;
            out.print( "                                                        " + localUtil.format( AV18Lit3, "") + "" + ":" + "" + localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9") );
            out.print( "\n\n" );
            Gx_line = (int)(Gx_line+2) ;
            out.print( "                          " + localUtil.format( AV15Lit0, "") );
            out.print( "\n\n" );
            Gx_line = (int)(Gx_line+2) ;
            out.print( "" + " " );
            out.print( "\n" );
            Gx_line = (int)(Gx_line+1) ;
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
      this.aP0[0] = rstrmod.this.A1115ModSCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Lit0 = "" ;
      AV16Lit1 = "" ;
      AV17Lit2 = "" ;
      AV18Lit3 = "" ;
      AV19Lit4 = "" ;
      AV20Lit5 = "" ;
      AV21Lit6 = "" ;
      AV22Lit7 = "" ;
      AV23Lit8 = "" ;
      AV24Lit9 = "" ;
      AV25Lit10 = "" ;
      AV26Lit11 = "" ;
      AV27Lit12 = "" ;
      AV28Lit13 = "" ;
      AV29Lit14 = "" ;
      AV30Lit15 = "" ;
      AV31Lit16 = "" ;
      AV32Lit17 = "" ;
      AV33Lit18 = "" ;
      AV34Lit19 = "" ;
      AV35Lit20 = "" ;
      AV36Lit21 = "" ;
      AV37Lit22 = "" ;
      AV38Lit23 = "" ;
      AV39Lit24 = "" ;
      AV40Lit25 = "" ;
      AV41Lit26 = "" ;
      AV42Lit27 = "" ;
      AV43Lit28 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P065X2_A1115ModSCod = new String[] {""} ;
      P065X2_A1116ModSDsc = new String[] {""} ;
      P065X2_n1116ModSDsc = new boolean[] {false} ;
      A1116ModSDsc = "" ;
      P065X3_A1115ModSCod = new String[] {""} ;
      P065X3_A1111ModSAtDec = new byte[1] ;
      P065X3_n1111ModSAtDec = new boolean[] {false} ;
      P065X3_A1112ModSAtLon = new byte[1] ;
      P065X3_n1112ModSAtLon = new boolean[] {false} ;
      P065X3_A1114ModSAtTip = new String[] {""} ;
      P065X3_n1114ModSAtTip = new boolean[] {false} ;
      P065X3_A1113ModSAtNom = new String[] {""} ;
      P065X3_n1113ModSAtNom = new boolean[] {false} ;
      P065X3_A1110ModSAtCod = new String[] {""} ;
      P065X3_n1110ModSAtCod = new boolean[] {false} ;
      P065X3_A1117ModSLin = new byte[1] ;
      A1114ModSAtTip = "" ;
      A1113ModSAtNom = "" ;
      A1110ModSAtCod = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rstrmod__default(),
         new Object[] {
             new Object[] {
            P065X2_A1115ModSCod, P065X2_A1116ModSDsc, P065X2_n1116ModSDsc
            }
            , new Object[] {
            P065X3_A1115ModSCod, P065X3_A1111ModSAtDec, P065X3_n1111ModSAtDec, P065X3_A1112ModSAtLon, P065X3_n1112ModSAtLon, P065X3_A1114ModSAtTip, P065X3_n1114ModSAtTip, P065X3_A1113ModSAtNom, P065X3_n1113ModSAtNom, P065X3_A1110ModSAtCod,
            P065X3_n1110ModSAtCod, P065X3_A1117ModSLin
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A1111ModSAtDec ;
   private byte A1112ModSAtLon ;
   private byte A1117ModSLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int P_lines ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_line ;
   private int Gx_page ;
   private String A1115ModSCod ;
   private String AV15Lit0 ;
   private String AV16Lit1 ;
   private String AV17Lit2 ;
   private String AV18Lit3 ;
   private String AV19Lit4 ;
   private String AV20Lit5 ;
   private String AV21Lit6 ;
   private String AV22Lit7 ;
   private String AV23Lit8 ;
   private String AV24Lit9 ;
   private String AV25Lit10 ;
   private String AV26Lit11 ;
   private String AV27Lit12 ;
   private String AV28Lit13 ;
   private String AV29Lit14 ;
   private String AV30Lit15 ;
   private String AV31Lit16 ;
   private String AV32Lit17 ;
   private String AV33Lit18 ;
   private String AV34Lit19 ;
   private String AV35Lit20 ;
   private String AV36Lit21 ;
   private String AV37Lit22 ;
   private String AV38Lit23 ;
   private String AV39Lit24 ;
   private String AV40Lit25 ;
   private String AV41Lit26 ;
   private String AV42Lit27 ;
   private String AV43Lit28 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A1116ModSDsc ;
   private String A1114ModSAtTip ;
   private String A1113ModSAtNom ;
   private String A1110ModSAtCod ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean n1116ModSDsc ;
   private boolean n1111ModSAtDec ;
   private boolean n1112ModSAtLon ;
   private boolean n1114ModSAtTip ;
   private boolean n1113ModSAtNom ;
   private boolean n1110ModSAtCod ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P065X2_A1115ModSCod ;
   private String[] P065X2_A1116ModSDsc ;
   private boolean[] P065X2_n1116ModSDsc ;
   private String[] P065X3_A1115ModSCod ;
   private byte[] P065X3_A1111ModSAtDec ;
   private boolean[] P065X3_n1111ModSAtDec ;
   private byte[] P065X3_A1112ModSAtLon ;
   private boolean[] P065X3_n1112ModSAtLon ;
   private String[] P065X3_A1114ModSAtTip ;
   private boolean[] P065X3_n1114ModSAtTip ;
   private String[] P065X3_A1113ModSAtNom ;
   private boolean[] P065X3_n1113ModSAtNom ;
   private String[] P065X3_A1110ModSAtCod ;
   private boolean[] P065X3_n1110ModSAtCod ;
   private byte[] P065X3_A1117ModSLin ;
}

final  class rstrmod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P065X2", "SELECT ModSCod, ModSDsc FROM TXPCMODSI WHERE ModSCod = ? ORDER BY ModSCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P065X3", "SELECT ModSCod, ModSAtDec, ModSAtLon, ModSAtTip, ModSAtNom, ModSAtCod, ModSLin FROM TXPLMODSI WHERE ModSCod = ? ORDER BY ModSCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
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
               stmt.setString(1, (String)parms[0], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 6);
               return;
      }
   }

}

