package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pcolacrx extends GXReportText
{
   public pcolacrx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcolacrx.class ), "" );
   }

   public pcolacrx( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 )
   {
      pcolacrx.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 )
   {
      pcolacrx.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcolacrx.this.AV16CliCod = aP1[0];
      this.aP1 = aP1;
      pcolacrx.this.AV17ForSer = aP2[0];
      this.aP2 = aP2;
      pcolacrx.this.AV18ForColNom = aP3[0];
      this.aP3 = aP3;
      pcolacrx.this.AV19ForColNum = aP4[0];
      this.aP4 = aP4;
      pcolacrx.this.AV20TipColCod = aP5[0];
      this.aP5 = aP5;
      pcolacrx.this.AV8ForNumColO = aP6[0];
      this.aP6 = aP6;
      pcolacrx.this.AV21IntCod = aP7[0];
      this.aP7 = aP7;
      pcolacrx.this.AV22MatCod = aP8[0];
      this.aP8 = aP8;
      pcolacrx.this.AV23ForTonal = aP9[0];
      this.aP9 = aP9;
      pcolacrx.this.AV24MacProCod = aP10[0];
      this.aP10 = aP10;
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
         setOutput( "pcolacrx.prn" );
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
               setOutput( "pcolacrx.prn" );
            }
         }
      }
      h2550( false, 0) ;
      out.print( "  " + "Formula Original" + " " + localUtil.format( DecimalUtil.doubleToDec(AV8ForNumColO), "ZZZZZZZ9") + "                      " + "Intensidad:" + " " + localUtil.format( DecimalUtil.doubleToDec(AV21IntCod), "Z9") + "     " + "Matiz:" + " " + localUtil.format( DecimalUtil.doubleToDec(AV22MatCod), "ZZ9") );
      ToSkip = 1 ;
      h2550( false, 0) ;
      out.print( "  " + "Formula Destino" + "  " + localUtil.format( DecimalUtil.doubleToDec(AV16CliCod), "ZZZZZ9") + " " + localUtil.format( AV17ForSer, "") + " " + localUtil.format( AV18ForColNom, "") + " " + localUtil.format( DecimalUtil.doubleToDec(AV19ForColNum), "ZZZZZ9") + " " + localUtil.format( DecimalUtil.doubleToDec(AV20TipColCod), "Z9") + "  " + localUtil.format( AV23ForTonal, "") );
      ToSkip = 1 ;
      /* Using cursor P02552 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), AV17ForSer, AV18ForColNom, Integer.valueOf(AV19ForColNum), Byte.valueOf(AV20TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P02552_A831TipColCod[0] ;
         A483ForColNum = P02552_A483ForColNum[0] ;
         A482ForColNom = P02552_A482ForColNom[0] ;
         A494ForSer = P02552_A494ForSer[0] ;
         A252CliCod = P02552_A252CliCod[0] ;
         A486ForNumCol = P02552_A486ForNumCol[0] ;
         A583IntCod = P02552_A583IntCod[0] ;
         A626MatCod = P02552_A626MatCod[0] ;
         A995ForTonal = P02552_A995ForTonal[0] ;
         n995ForTonal = P02552_n995ForTonal[0] ;
         A1514MacProCod = P02552_A1514MacProCod[0] ;
         n1514MacProCod = P02552_n1514MacProCod[0] ;
         AV9ForNumColD = A486ForNumCol ;
         h2550( false, 0) ;
         out.print( "         " + "Formula Destino" + " " + localUtil.format( DecimalUtil.doubleToDec(AV9ForNumColD), "ZZZZZZZ9") + "     " + "Modificada Intensidad:" + " " + localUtil.format( DecimalUtil.doubleToDec(AV21IntCod), "Z9") + "     " + "Matiz:" + " " + localUtil.format( DecimalUtil.doubleToDec(AV22MatCod), "ZZ9") );
         ToSkip = 1 ;
         A583IntCod = AV21IntCod ;
         A626MatCod = AV22MatCod ;
         A995ForTonal = AV23ForTonal ;
         n995ForTonal = false ;
         A1514MacProCod = AV24MacProCod ;
         n1514MacProCod = false ;
         if ( AV9ForNumColD == AV8ForNumColO )
         {
            pr_default.close(0);
            /* Close printer file */
            /* Close text printer */
            out.close();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P02553 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A490ForPrdUMe = P02553_A490ForPrdUMe[0] ;
            A481ForCan = P02553_A481ForCan[0] ;
            A309ColLin = P02553_A309ColLin[0] ;
            A719PrdNum = P02553_A719PrdNum[0] ;
            h2550( false, 0) ;
            out.print( "               " + "Eliminando" + " " + localUtil.format( A719PrdNum, "") );
            ToSkip = 1 ;
            /* Using cursor P02554 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P02555 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1160ProForL = P02555_A1160ProForL[0] ;
            A764ProForCod = P02555_A764ProForCod[0] ;
            h2550( false, 0) ;
            out.print( "               " + "Eliminando" + " " + localUtil.format( A764ProForCod, "") );
            ToSkip = 1 ;
            /* Using cursor P02556 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Using cursor P02557 */
         pr_default.execute(5, new Object[] {Byte.valueOf(A583IntCod), Short.valueOf(A626MatCod), Boolean.valueOf(n995ForTonal), A995ForTonal, Boolean.valueOf(n1514MacProCod), A1514MacProCod, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02558 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV8ForNumColO)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A486ForNumCol = P02558_A486ForNumCol[0] ;
         A309ColLin = P02558_A309ColLin[0] ;
         A481ForCan = P02558_A481ForCan[0] ;
         A490ForPrdUMe = P02558_A490ForPrdUMe[0] ;
         A719PrdNum = P02558_A719PrdNum[0] ;
         AV10ColLin = A309ColLin ;
         AV11ForCan = A481ForCan ;
         AV12ForPrdUMe = A490ForPrdUMe ;
         AV13PrdNum = A719PrdNum ;
         h2550( false, 0) ;
         out.print( "         " + "Copiando" + "   " + localUtil.format( DecimalUtil.doubleToDec(AV10ColLin), "ZZ9") + "  " + localUtil.format( AV13PrdNum, "") + " " + localUtil.format( AV11ForCan, "ZZZZ9.99999") + " " + localUtil.format( DecimalUtil.doubleToDec(AV12ForPrdUMe), "9") );
         ToSkip = 1 ;
         /* Execute user subroutine: 'NEW_COL' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            /* Close printer file */
            /* Close text printer */
            out.close();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
      /* Using cursor P02559 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV8ForNumColO)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A252CliCod = P02559_A252CliCod[0] ;
         A494ForSer = P02559_A494ForSer[0] ;
         A482ForColNom = P02559_A482ForColNom[0] ;
         A483ForColNum = P02559_A483ForColNum[0] ;
         A831TipColCod = P02559_A831TipColCod[0] ;
         A486ForNumCol = P02559_A486ForNumCol[0] ;
         A764ProForCod = P02559_A764ProForCod[0] ;
         A1160ProForL = P02559_A1160ProForL[0] ;
         A486ForNumCol = P02559_A486ForNumCol[0] ;
         AV14ProForCod = A764ProForCod ;
         AV15ProForL = A1160ProForL ;
         h2550( false, 0) ;
         out.print( "          " + "Copiando" + "   " + localUtil.format( DecimalUtil.doubleToDec(AV15ProForL), "ZZZ9") + " " + localUtil.format( AV14ProForCod, "") );
         ToSkip = 1 ;
         /* Execute user subroutine: 'NEW_PRO' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(7);
            pr_default.close(7);
            /* Close printer file */
            /* Close text printer */
            out.close();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
      /* Print footer for last page */
      ToSkip = (int)(P_lines+1) ;
      h2550( true, 0) ;
      /* Close printer file */
      /* Close text printer */
      out.close();
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'NEW_COL' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPLDFORM

      */
      A309ColLin = AV10ColLin ;
      A481ForCan = AV11ForCan ;
      A490ForPrdUMe = AV12ForPrdUMe ;
      A719PrdNum = AV13PrdNum ;
      A486ForNumCol = AV9ForNumColD ;
      /* Using cursor P025510 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A481ForCan});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
      if ( (pr_default.getStatus(8) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'NEW_PRO' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPLFORMU

      */
      A252CliCod = AV16CliCod ;
      A494ForSer = AV17ForSer ;
      A482ForColNom = AV18ForColNom ;
      A483ForColNum = AV19ForColNum ;
      A764ProForCod = AV14ProForCod ;
      A1160ProForL = AV15ProForL ;
      /* Using cursor P025511 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL), A764ProForCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
      if ( (pr_default.getStatus(9) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
   }

   public void h2550( boolean bFoot ,
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
      this.aP0[0] = pcolacrx.this.A396EmprCod;
      this.aP1[0] = pcolacrx.this.AV16CliCod;
      this.aP2[0] = pcolacrx.this.AV17ForSer;
      this.aP3[0] = pcolacrx.this.AV18ForColNom;
      this.aP4[0] = pcolacrx.this.AV19ForColNum;
      this.aP5[0] = pcolacrx.this.AV20TipColCod;
      this.aP6[0] = pcolacrx.this.AV8ForNumColO;
      this.aP7[0] = pcolacrx.this.AV21IntCod;
      this.aP8[0] = pcolacrx.this.AV22MatCod;
      this.aP9[0] = pcolacrx.this.AV23ForTonal;
      this.aP10[0] = pcolacrx.this.AV24MacProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcolacrx");
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
      P02552_A396EmprCod = new String[] {""} ;
      P02552_A831TipColCod = new byte[1] ;
      P02552_A483ForColNum = new int[1] ;
      P02552_A482ForColNom = new String[] {""} ;
      P02552_A494ForSer = new String[] {""} ;
      P02552_A252CliCod = new int[1] ;
      P02552_A486ForNumCol = new int[1] ;
      P02552_A583IntCod = new byte[1] ;
      P02552_A626MatCod = new short[1] ;
      P02552_A995ForTonal = new String[] {""} ;
      P02552_n995ForTonal = new boolean[] {false} ;
      P02552_A1514MacProCod = new String[] {""} ;
      P02552_n1514MacProCod = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A995ForTonal = "" ;
      A1514MacProCod = "" ;
      P02553_A396EmprCod = new String[] {""} ;
      P02553_A486ForNumCol = new int[1] ;
      P02553_A490ForPrdUMe = new byte[1] ;
      P02553_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02553_A309ColLin = new short[1] ;
      P02553_A719PrdNum = new String[] {""} ;
      A481ForCan = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      P02555_A396EmprCod = new String[] {""} ;
      P02555_A252CliCod = new int[1] ;
      P02555_A494ForSer = new String[] {""} ;
      P02555_A482ForColNom = new String[] {""} ;
      P02555_A483ForColNum = new int[1] ;
      P02555_A831TipColCod = new byte[1] ;
      P02555_A1160ProForL = new short[1] ;
      P02555_A764ProForCod = new String[] {""} ;
      A764ProForCod = "" ;
      P02558_A396EmprCod = new String[] {""} ;
      P02558_A486ForNumCol = new int[1] ;
      P02558_A309ColLin = new short[1] ;
      P02558_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02558_A490ForPrdUMe = new byte[1] ;
      P02558_A719PrdNum = new String[] {""} ;
      AV11ForCan = DecimalUtil.ZERO ;
      AV13PrdNum = "" ;
      P02559_A252CliCod = new int[1] ;
      P02559_A494ForSer = new String[] {""} ;
      P02559_A482ForColNom = new String[] {""} ;
      P02559_A483ForColNum = new int[1] ;
      P02559_A831TipColCod = new byte[1] ;
      P02559_A396EmprCod = new String[] {""} ;
      P02559_A486ForNumCol = new int[1] ;
      P02559_A764ProForCod = new String[] {""} ;
      P02559_A1160ProForL = new short[1] ;
      AV14ProForCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcolacrx__default(),
         new Object[] {
             new Object[] {
            P02552_A396EmprCod, P02552_A831TipColCod, P02552_A483ForColNum, P02552_A482ForColNom, P02552_A494ForSer, P02552_A252CliCod, P02552_A486ForNumCol, P02552_A583IntCod, P02552_A626MatCod, P02552_A995ForTonal,
            P02552_n995ForTonal, P02552_A1514MacProCod, P02552_n1514MacProCod
            }
            , new Object[] {
            P02553_A396EmprCod, P02553_A486ForNumCol, P02553_A490ForPrdUMe, P02553_A481ForCan, P02553_A309ColLin, P02553_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            P02555_A396EmprCod, P02555_A252CliCod, P02555_A494ForSer, P02555_A482ForColNom, P02555_A483ForColNum, P02555_A831TipColCod, P02555_A1160ProForL, P02555_A764ProForCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02558_A396EmprCod, P02558_A486ForNumCol, P02558_A309ColLin, P02558_A481ForCan, P02558_A490ForPrdUMe, P02558_A719PrdNum
            }
            , new Object[] {
            P02559_A252CliCod, P02559_A494ForSer, P02559_A482ForColNom, P02559_A483ForColNum, P02559_A831TipColCod, P02559_A396EmprCod, P02559_A486ForNumCol, P02559_A764ProForCod, P02559_A1160ProForL
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV20TipColCod ;
   private byte AV21IntCod ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte A490ForPrdUMe ;
   private byte AV12ForPrdUMe ;
   private short AV22MatCod ;
   private short A626MatCod ;
   private short A309ColLin ;
   private short A1160ProForL ;
   private short AV10ColLin ;
   private short AV15ProForL ;
   private short Gx_err ;
   private int AV16CliCod ;
   private int AV19ForColNum ;
   private int AV8ForNumColO ;
   private int M_top ;
   private int M_bot ;
   private int P_lines ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_line ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A486ForNumCol ;
   private int AV9ForNumColD ;
   private int GX_INS33 ;
   private int GX_INS154 ;
   private int Gx_page ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal AV11ForCan ;
   private String A396EmprCod ;
   private String AV17ForSer ;
   private String AV18ForColNom ;
   private String AV23ForTonal ;
   private String AV24MacProCod ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A995ForTonal ;
   private String A1514MacProCod ;
   private String A719PrdNum ;
   private String A764ProForCod ;
   private String AV13PrdNum ;
   private String AV14ProForCod ;
   private String Gx_emsg ;
   private boolean n995ForTonal ;
   private boolean n1514MacProCod ;
   private boolean returnInSub ;
   private String[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private int[] aP6 ;
   private byte[] aP7 ;
   private short[] aP8 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P02552_A396EmprCod ;
   private byte[] P02552_A831TipColCod ;
   private int[] P02552_A483ForColNum ;
   private String[] P02552_A482ForColNom ;
   private String[] P02552_A494ForSer ;
   private int[] P02552_A252CliCod ;
   private int[] P02552_A486ForNumCol ;
   private byte[] P02552_A583IntCod ;
   private short[] P02552_A626MatCod ;
   private String[] P02552_A995ForTonal ;
   private boolean[] P02552_n995ForTonal ;
   private String[] P02552_A1514MacProCod ;
   private boolean[] P02552_n1514MacProCod ;
   private String[] P02553_A396EmprCod ;
   private int[] P02553_A486ForNumCol ;
   private byte[] P02553_A490ForPrdUMe ;
   private java.math.BigDecimal[] P02553_A481ForCan ;
   private short[] P02553_A309ColLin ;
   private String[] P02553_A719PrdNum ;
   private String[] P02555_A396EmprCod ;
   private int[] P02555_A252CliCod ;
   private String[] P02555_A494ForSer ;
   private String[] P02555_A482ForColNom ;
   private int[] P02555_A483ForColNum ;
   private byte[] P02555_A831TipColCod ;
   private short[] P02555_A1160ProForL ;
   private String[] P02555_A764ProForCod ;
   private String[] P02558_A396EmprCod ;
   private int[] P02558_A486ForNumCol ;
   private short[] P02558_A309ColLin ;
   private java.math.BigDecimal[] P02558_A481ForCan ;
   private byte[] P02558_A490ForPrdUMe ;
   private String[] P02558_A719PrdNum ;
   private int[] P02559_A252CliCod ;
   private String[] P02559_A494ForSer ;
   private String[] P02559_A482ForColNom ;
   private int[] P02559_A483ForColNum ;
   private byte[] P02559_A831TipColCod ;
   private String[] P02559_A396EmprCod ;
   private int[] P02559_A486ForNumCol ;
   private String[] P02559_A764ProForCod ;
   private short[] P02559_A1160ProForL ;
}

final  class pcolacrx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02552", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumCol, IntCod, MatCod, ForTonal, MacProCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02553", "SELECT EmprCod, ForNumCol, ForPrdUMe, ForCan, ColLin, PrdNum FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02554", "DELETE FROM TXPLDFORM  WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDFORM")
         ,new ForEachCursor("P02555", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL, ProForCod FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02556", "DELETE FROM TXPLFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
         ,new UpdateCursor("P02557", "UPDATE TXPCFORMU SET IntCod=?, MatCod=?, ForTonal=?, MacProCod=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
         ,new ForEachCursor("P02558", "SELECT EmprCod, ForNumCol, ColLin, ForCan, ForPrdUMe, PrdNum FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02559", "SELECT T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.EmprCod, T2.ForNumCol, T1.ProForCod, T1.ProForL FROM (TXPLFORMU T1 INNER JOIN TXPCFORMU T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ForSer = T1.ForSer AND T2.ForColNom = T1.ForColNom AND T2.ForColNum = T1.ForColNum AND T2.TipColCod = T1.TipColCod) WHERE (T1.EmprCod = ?) AND (T2.ForNumCol = ?) ORDER BY T1.EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P025510", "INSERT INTO TXPLDFORM(EmprCod, ForNumCol, ColLin, PrdNum, ForPrdUMe, ForCan, TotLinCol, ForClaCol, ColFibra) VALUES(?, ?, ?, ?, ?, ?, 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDFORM")
         ,new UpdateCursor("P025511", "INSERT INTO TXPLFORMU(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL, ProForCod, ProForFR, ProFoNPrg, ProForrbn, ProForVol, ProForMq, ProForH2O, ProforFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 5 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 20);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 6);
               }
               stmt.setString(5, (String)parms[6], 3);
               stmt.setInt(6, ((Number) parms[7]).intValue());
               stmt.setString(7, (String)parms[8], 16);
               stmt.setString(8, (String)parms[9], 13);
               stmt.setInt(9, ((Number) parms[10]).intValue());
               stmt.setByte(10, ((Number) parms[11]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 6);
               return;
      }
   }

}

