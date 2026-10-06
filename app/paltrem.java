package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paltrem extends GXProcedure
{
   public paltrem( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paltrem.class ), "" );
   }

   public paltrem( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           short[] aP2 ,
                                           java.util.Date[] aP3 )
   {
      paltrem.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      paltrem.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      paltrem.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      paltrem.this.AV21LinEnt = aP2[0];
      this.aP2 = aP2;
      paltrem.this.AV19FecRec = aP3[0];
      this.aP3 = aP3;
      paltrem.this.AV16Unidades = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV22NCLec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int2) ;
      paltrem.this.GXt_int1 = GXv_int2[0] ;
      AV22NCLec = GXt_int1 ;
      GXt_int3 = AV28Consumos ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int4) ;
      paltrem.this.GXt_int3 = GXv_int4[0] ;
      AV28Consumos = (byte)(GXt_int3) ;
      AV38Entalm = (byte)(0) ;
      /* Using cursor P00TN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A419EntUniRem = P00TN2_A419EntUniRem[0] ;
         A597LinEnt = P00TN2_A597LinEnt[0] ;
         AV38Entalm = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P00TN3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A795PrvNum = P00TN3_A795PrvNum[0] ;
         A724PrdPreAct = P00TN3_A724PrdPreAct[0] ;
         A716PrdLotMin = P00TN3_A716PrdLotMin[0] ;
         A698PrdDetPar = P00TN3_A698PrdDetPar[0] ;
         A750PrdValStk = P00TN3_A750PrdValStk[0] ;
         A726PrdPreMed = P00TN3_A726PrdPreMed[0] ;
         AV23PrvNum = A795PrvNum ;
         AV24PrdPreact = A724PrdPreAct ;
         AV29PrdLotMin = A716PrdLotMin ;
         if ( AV29PrdLotMin == 0 )
         {
            AV29PrdLotMin = (short)(1) ;
         }
         AV41PrdDetPar = A698PrdDetPar ;
         Gx_msg = A719PrdNum + httpContext.getMessage( " In PALTREM. Act PRODUC", "") ;
         System.out.println( Gx_msg );
         if ( AV38Entalm == 0 )
         {
            AV40PrdValStk = ((DecimalUtil.compareTo(AV40PrdValStk, DecimalUtil.stringToDec("99999999.99"))>0) ? DecimalUtil.stringToDec("99999999.99") : GXutil.roundDecimal( AV24PrdPreact.multiply(AV16Unidades), 2)) ;
            A750PrdValStk = AV40PrdValStk ;
            A726PrdPreMed = ((DecimalUtil.compareTo((AV24PrdPreact.multiply(AV16Unidades)), DecimalUtil.stringToDec("99999999.999"))>0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV24PrdPreact.multiply(AV16Unidades)), 3)) ;
         }
         Gx_msg = A719PrdNum + httpContext.getMessage( " End PALTREM. Act PRODUC", "") ;
         System.out.println( Gx_msg );
         /* Using cursor P00TN4 */
         pr_default.execute(2, new Object[] {A750PrdValStk, A726PrdPreMed, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV20Fecha = GXutil.substring( localUtil.dtoc( AV19FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2) + GXutil.substring( localUtil.dtoc( AV19FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2) + GXutil.substring( localUtil.dtoc( AV19FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 7, 2) ;
      AV26EntConIni = 0 ;
      AV39EntConFin = 0 ;
      if ( ( AV28Consumos == 0 ) && ( AV16Unidades.doubleValue() > 0 ) && ( GXutil.strcmp(AV41PrdDetPar, httpContext.getMessage( "S", "")) == 0 ) )
      {
         AV31Num_con = (short)(GXutil.Int( DecimalUtil.decToDouble(AV16Unidades.divide(DecimalUtil.doubleToDec(AV29PrdLotMin), 18, java.math.RoundingMode.DOWN)))) ;
         AV37Dif_cont = (short)(0) ;
         if ( GXutil.Int( DecimalUtil.decToDouble(AV16Unidades.divide(DecimalUtil.doubleToDec(AV29PrdLotMin), 18, java.math.RoundingMode.DOWN))) == (AV16Unidades.divide(DecimalUtil.doubleToDec(AV29PrdLotMin), 18, java.math.RoundingMode.DOWN)).doubleValue() )
         {
            AV37Dif_cont = (short)(0) ;
         }
         else
         {
            AV32Und_pc = AV16Unidades.divide(DecimalUtil.doubleToDec(AV29PrdLotMin), 18, java.math.RoundingMode.DOWN) ;
            AV33Und_pc2 = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV16Unidades.divide(DecimalUtil.doubleToDec(AV29PrdLotMin), 18, java.math.RoundingMode.DOWN)))) ;
            AV34Und_pc3 = AV32Und_pc.subtract(AV33Und_pc2) ;
            AV35Und_pc4 = AV34Und_pc3.multiply(DecimalUtil.doubleToDec(AV29PrdLotMin)) ;
            AV37Dif_cont = (short)(1) ;
         }
         if ( AV29PrdLotMin == 1 )
         {
            /* Using cursor P00TN5 */
            pr_default.execute(3, new Object[] {A396EmprCod});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A313ContCod = P00TN5_A313ContCod[0] ;
               A316ContVal = P00TN5_A316ContVal[0] ;
               AV25ContIni = (short)(A316ContVal) ;
               A316ContVal = (int)(A316ContVal+1) ;
               /* Using cursor P00TN6 */
               pr_default.execute(4, new Object[] {Integer.valueOf(A316ContVal), A396EmprCod, A313ContCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
            AV39EntConFin = AV25ContIni ;
         }
         else
         {
            /* Using cursor P00TN7 */
            pr_default.execute(5, new Object[] {A396EmprCod});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A313ContCod = P00TN7_A313ContCod[0] ;
               A316ContVal = P00TN7_A316ContVal[0] ;
               AV25ContIni = (short)(A316ContVal) ;
               A316ContVal = (int)(A316ContVal+((AV31Num_con+AV37Dif_cont))) ;
               /* Using cursor P00TN8 */
               pr_default.execute(6, new Object[] {Integer.valueOf(A316ContVal), A396EmprCod, A313ContCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(5);
            AV39EntConFin = (int)((AV31Num_con+AV37Dif_cont)) ;
         }
         AV26EntConIni = AV25ContIni ;
         if ( AV29PrdLotMin == 1 )
         {
            Gx_msg = A719PrdNum + httpContext.getMessage( " In PALTREM. New DETCON", "") ;
            System.out.println( Gx_msg );
            /*
               INSERT RECORD ON TABLE TXPDETCON

            */
            A647NumCon = AV25ContIni ;
            A322DetUni = AV16Unidades ;
            n322DetUni = false ;
            A321DetFec = AV19FecRec ;
            n321DetFec = false ;
            A8456DetObs = httpContext.getMessage( "REC.", "") + AV20Fecha ;
            n8456DetObs = false ;
            /* Using cursor P00TN9 */
            pr_default.execute(7, new Object[] {A396EmprCod, A719PrdNum, Integer.valueOf(A647NumCon), Boolean.valueOf(n322DetUni), A322DetUni, Boolean.valueOf(n321DetFec), A321DetFec, Boolean.valueOf(n8456DetObs), A8456DetObs});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDETCON");
            if ( (pr_default.getStatus(7) == 1) )
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
            Gx_msg = A719PrdNum + httpContext.getMessage( " End PALTREM. New DETCON", "") ;
            System.out.println( Gx_msg );
         }
         else
         {
            AV36i = (short)(1) ;
            while ( AV36i <= AV31Num_con )
            {
               Gx_msg = A719PrdNum + httpContext.getMessage( " In PALTREM. New DETCON.2", "") ;
               System.out.println( Gx_msg );
               /*
                  INSERT RECORD ON TABLE TXPDETCON

               */
               A647NumCon = AV25ContIni ;
               A322DetUni = DecimalUtil.doubleToDec(AV29PrdLotMin) ;
               n322DetUni = false ;
               A321DetFec = AV19FecRec ;
               n321DetFec = false ;
               A8456DetObs = httpContext.getMessage( "REC.", "") + AV20Fecha ;
               n8456DetObs = false ;
               /* Using cursor P00TN10 */
               pr_default.execute(8, new Object[] {A396EmprCod, A719PrdNum, Integer.valueOf(A647NumCon), Boolean.valueOf(n322DetUni), A322DetUni, Boolean.valueOf(n321DetFec), A321DetFec, Boolean.valueOf(n8456DetObs), A8456DetObs});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDETCON");
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
               Gx_msg = A719PrdNum + httpContext.getMessage( " End PALTREM. New DETCON.2", "") ;
               System.out.println( Gx_msg );
               AV25ContIni = (short)(AV25ContIni+1) ;
               AV36i = (short)(AV36i+1) ;
            }
            if ( AV37Dif_cont == 1 )
            {
               Gx_msg = A719PrdNum + httpContext.getMessage( " In PALTREM. New DETCON.3", "") ;
               System.out.println( Gx_msg );
               /*
                  INSERT RECORD ON TABLE TXPDETCON

               */
               A647NumCon = AV25ContIni ;
               A322DetUni = AV35Und_pc4 ;
               n322DetUni = false ;
               A321DetFec = AV19FecRec ;
               n321DetFec = false ;
               A8456DetObs = httpContext.getMessage( "REC.", "") + AV20Fecha ;
               n8456DetObs = false ;
               /* Using cursor P00TN11 */
               pr_default.execute(9, new Object[] {A396EmprCod, A719PrdNum, Integer.valueOf(A647NumCon), Boolean.valueOf(n322DetUni), A322DetUni, Boolean.valueOf(n321DetFec), A321DetFec, Boolean.valueOf(n8456DetObs), A8456DetObs});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDETCON");
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
               Gx_msg = A719PrdNum + httpContext.getMessage( " In PALTREM. New DETCON.3", "") ;
               System.out.println( Gx_msg );
            }
         }
      }
      Gx_msg = A719PrdNum + httpContext.getMessage( " In PALTREM. New ENTALM", "") ;
      System.out.println( Gx_msg );
      /*
         INSERT RECORD ON TABLE TXPENTALM

      */
      A597LinEnt = AV21LinEnt ;
      A11Albaran = httpContext.getMessage( "REC.", "") + AV20Fecha ;
      A658PedCod = 0 ;
      n658PedCod = false ;
      A418EntUniEnt = AV16Unidades ;
      A417EntPre = AV24PrdPreact ;
      if ( AV28Consumos == 0 )
      {
         A416EntNumCon = (short)(1) ;
      }
      else
      {
         A416EntNumCon = (short)(0) ;
      }
      A419EntUniRem = AV16Unidades ;
      A414EntEti = (byte)(1) ;
      if ( A418EntUniEnt.doubleValue() < 0 )
      {
         A411EntCon = (byte)(1) ;
      }
      else
      {
         A411EntCon = (byte)(0) ;
      }
      A411EntCon = (byte)(0) ;
      A415EntFecEnt = AV19FecRec ;
      A413EntConIni = AV26EntConIni ;
      A412EntConFin = AV39EntConFin ;
      A3404EntPedCum = httpContext.getMessage( "S", "") ;
      A6156EntPrvNum = AV23PrvNum ;
      n6156EntPrvNum = false ;
      A12716EntFabId = AV23PrvNum ;
      /* Using cursor P00TN12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt), A11Albaran, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A418EntUniEnt, A417EntPre, Short.valueOf(A416EntNumCon), A419EntUniRem, Byte.valueOf(A414EntEti), Byte.valueOf(A411EntCon), A415EntFecEnt, Integer.valueOf(A413EntConIni), Integer.valueOf(A412EntConFin), A3404EntPedCum, Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum), Integer.valueOf(A12716EntFabId)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
      if ( (pr_default.getStatus(10) == 1) )
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
      Gx_msg = A719PrdNum + httpContext.getMessage( " End PALTREM. New DETCON", "") ;
      System.out.println( Gx_msg );
      if ( AV22NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "paltrem");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paltrem.this.A396EmprCod;
      this.aP1[0] = paltrem.this.A719PrdNum;
      this.aP2[0] = paltrem.this.AV21LinEnt;
      this.aP3[0] = paltrem.this.AV19FecRec;
      this.aP4[0] = paltrem.this.AV16Unidades;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      GXv_int4 = new int[1] ;
      scmdbuf = "" ;
      P00TN2_A396EmprCod = new String[] {""} ;
      P00TN2_A719PrdNum = new String[] {""} ;
      P00TN2_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00TN2_A597LinEnt = new short[1] ;
      A419EntUniRem = DecimalUtil.ZERO ;
      P00TN3_A396EmprCod = new String[] {""} ;
      P00TN3_A719PrdNum = new String[] {""} ;
      P00TN3_A795PrvNum = new int[1] ;
      P00TN3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00TN3_A716PrdLotMin = new short[1] ;
      P00TN3_A698PrdDetPar = new String[] {""} ;
      P00TN3_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00TN3_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A698PrdDetPar = "" ;
      A750PrdValStk = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      AV24PrdPreact = DecimalUtil.ZERO ;
      AV41PrdDetPar = "" ;
      Gx_msg = "" ;
      AV40PrdValStk = DecimalUtil.ZERO ;
      AV20Fecha = "" ;
      AV32Und_pc = DecimalUtil.ZERO ;
      AV33Und_pc2 = DecimalUtil.ZERO ;
      AV34Und_pc3 = DecimalUtil.ZERO ;
      AV35Und_pc4 = DecimalUtil.ZERO ;
      P00TN5_A396EmprCod = new String[] {""} ;
      P00TN5_A313ContCod = new String[] {""} ;
      P00TN5_A316ContVal = new int[1] ;
      A313ContCod = "" ;
      P00TN7_A396EmprCod = new String[] {""} ;
      P00TN7_A313ContCod = new String[] {""} ;
      P00TN7_A316ContVal = new int[1] ;
      A322DetUni = DecimalUtil.ZERO ;
      A321DetFec = GXutil.nullDate() ;
      A8456DetObs = "" ;
      Gx_emsg = "" ;
      A11Albaran = "" ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      A415EntFecEnt = GXutil.nullDate() ;
      A3404EntPedCum = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.paltrem__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.paltrem__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.paltrem__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.paltrem__default(),
         new Object[] {
             new Object[] {
            P00TN2_A396EmprCod, P00TN2_A719PrdNum, P00TN2_A419EntUniRem, P00TN2_A597LinEnt
            }
            , new Object[] {
            P00TN3_A396EmprCod, P00TN3_A719PrdNum, P00TN3_A795PrvNum, P00TN3_A724PrdPreAct, P00TN3_A716PrdLotMin, P00TN3_A698PrdDetPar, P00TN3_A750PrdValStk, P00TN3_A726PrdPreMed
            }
            , new Object[] {
            }
            , new Object[] {
            P00TN5_A396EmprCod, P00TN5_A313ContCod, P00TN5_A316ContVal
            }
            , new Object[] {
            }
            , new Object[] {
            P00TN7_A396EmprCod, P00TN7_A313ContCod, P00TN7_A316ContVal
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22NCLec ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV28Consumos ;
   private byte AV38Entalm ;
   private byte A414EntEti ;
   private byte A411EntCon ;
   private short AV21LinEnt ;
   private short A597LinEnt ;
   private short A716PrdLotMin ;
   private short AV29PrdLotMin ;
   private short AV31Num_con ;
   private short AV37Dif_cont ;
   private short AV25ContIni ;
   private short Gx_err ;
   private short AV36i ;
   private short A416EntNumCon ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int A795PrvNum ;
   private int AV23PrvNum ;
   private int AV26EntConIni ;
   private int AV39EntConFin ;
   private int A316ContVal ;
   private int GX_INS30 ;
   private int A647NumCon ;
   private int GX_INS42 ;
   private int A658PedCod ;
   private int A413EntConIni ;
   private int A412EntConFin ;
   private int A6156EntPrvNum ;
   private int A12716EntFabId ;
   private java.math.BigDecimal AV16Unidades ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal AV24PrdPreact ;
   private java.math.BigDecimal AV40PrdValStk ;
   private java.math.BigDecimal AV32Und_pc ;
   private java.math.BigDecimal AV33Und_pc2 ;
   private java.math.BigDecimal AV34Und_pc3 ;
   private java.math.BigDecimal AV35Und_pc4 ;
   private java.math.BigDecimal A322DetUni ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A417EntPre ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String A698PrdDetPar ;
   private String AV41PrdDetPar ;
   private String Gx_msg ;
   private String AV20Fecha ;
   private String A313ContCod ;
   private String A8456DetObs ;
   private String Gx_emsg ;
   private String A11Albaran ;
   private String A3404EntPedCum ;
   private java.util.Date AV19FecRec ;
   private java.util.Date A321DetFec ;
   private java.util.Date A415EntFecEnt ;
   private boolean n322DetUni ;
   private boolean n321DetFec ;
   private boolean n8456DetObs ;
   private boolean n658PedCod ;
   private boolean n6156EntPrvNum ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private java.util.Date[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00TN2_A396EmprCod ;
   private String[] P00TN2_A719PrdNum ;
   private java.math.BigDecimal[] P00TN2_A419EntUniRem ;
   private short[] P00TN2_A597LinEnt ;
   private String[] P00TN3_A396EmprCod ;
   private String[] P00TN3_A719PrdNum ;
   private int[] P00TN3_A795PrvNum ;
   private java.math.BigDecimal[] P00TN3_A724PrdPreAct ;
   private short[] P00TN3_A716PrdLotMin ;
   private String[] P00TN3_A698PrdDetPar ;
   private java.math.BigDecimal[] P00TN3_A750PrdValStk ;
   private java.math.BigDecimal[] P00TN3_A726PrdPreMed ;
   private String[] P00TN5_A396EmprCod ;
   private String[] P00TN5_A313ContCod ;
   private int[] P00TN5_A316ContVal ;
   private String[] P00TN7_A396EmprCod ;
   private String[] P00TN7_A313ContCod ;
   private int[] P00TN7_A316ContVal ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class paltrem__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class paltrem__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class paltrem__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class paltrem__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00TN2", "SELECT * FROM (SELECT EmprCod, PrdNum, EntUniRem, LinEnt FROM TXPENTALM WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00TN3", "SELECT EmprCod, PrdNum, PrvNum, PrdPreAct, PrdLotMin, PrdDetPar, PrdValStk, PrdPreMed FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00TN4", "UPDATE TXPPRODUC SET PrdValStk=?, PrdPreMed=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new ForEachCursor("P00TN5", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = '010100' ORDER BY EmprCod, ContCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00TN6", "UPDATE TXPEMPLIN SET ContVal=?  WHERE EmprCod = ? AND ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
         ,new ForEachCursor("P00TN7", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = '010100' ORDER BY EmprCod, ContCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00TN8", "UPDATE TXPEMPLIN SET ContVal=?  WHERE EmprCod = ? AND ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
         ,new UpdateCursor("P00TN9", "INSERT INTO TXPDETCON(EmprCod, PrdNum, NumCon, DetUni, DetFec, DetObs) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDETCON")
         ,new UpdateCursor("P00TN10", "INSERT INTO TXPDETCON(EmprCod, PrdNum, NumCon, DetUni, DetFec, DetObs) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDETCON")
         ,new UpdateCursor("P00TN11", "INSERT INTO TXPDETCON(EmprCod, PrdNum, NumCon, DetUni, DetFec, DetObs) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDETCON")
         ,new UpdateCursor("P00TN12", "INSERT INTO TXPENTALM(EmprCod, PrdNum, LinEnt, Albaran, PedCod, EntUniEnt, EntPre, EntNumCon, EntUniRem, EntEti, EntCon, EntFecEnt, EntConIni, EntConFin, EntPedCum, EntPrvNum, EntFabId, EntNro, EntFVal, EntLotN, EntBnc, EntCC, EntCCoCod, EntRemTpo, EntRemSuc, EntRemFch, EntRemNro, EntUniAlb, EntObs, EntNAlbar, EntLoteID, EntUbicaci, EntNEmb, EntHfCon, EntFfCon, EntHiCon, EntFiCon) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[6]);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 30);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[6]);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 30);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[6]);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 30);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 10);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 5);
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 4);
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               stmt.setByte(11, ((Number) parms[11]).byteValue());
               stmt.setDate(12, (java.util.Date)parms[12]);
               stmt.setInt(13, ((Number) parms[13]).intValue());
               stmt.setInt(14, ((Number) parms[14]).intValue());
               stmt.setString(15, (String)parms[15], 1);
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[17]).intValue());
               }
               stmt.setInt(17, ((Number) parms[18]).intValue());
               return;
      }
   }

}

