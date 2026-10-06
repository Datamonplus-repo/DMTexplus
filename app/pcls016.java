package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcls016 extends GXProcedure
{
   public pcls016( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcls016.class ), "" );
   }

   public pcls016( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.util.Date[] aP7 ,
                             byte[] aP8 ,
                             int[] aP9 ,
                             byte[] aP10 )
   {
      pcls016.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        java.util.Date[] aP7 ,
                        byte[] aP8 ,
                        int[] aP9 ,
                        byte[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.util.Date[] aP7 ,
                             byte[] aP8 ,
                             int[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 )
   {
      pcls016.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcls016.this.AV37PrdNum = aP1[0];
      this.aP1 = aP1;
      pcls016.this.AV17CCStkCanE = aP2[0];
      this.aP2 = aP2;
      pcls016.this.AV40TipMovCc = aP3[0];
      this.aP3 = aP3;
      pcls016.this.AV23CCStkPre = aP4[0];
      this.aP4 = aP4;
      pcls016.this.AV27CCStkUsu = aP5[0];
      this.aP5 = aP5;
      pcls016.this.AV19CCStkDsc = aP6[0];
      this.aP6 = aP6;
      pcls016.this.AV9CC_Fech = aP7[0];
      this.aP7 = aP7;
      pcls016.this.AV8CC_AlmCod = aP8[0];
      this.aP8 = aP8;
      pcls016.this.AV10Cc_hdr1 = aP9[0];
      this.aP9 = aP9;
      pcls016.this.AV11Cc_hdr2 = aP10[0];
      this.aP10 = aP10;
      pcls016.this.AV12CC_hdr3 = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P055Y2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV37PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P055Y2_A719PrdNum[0] ;
         A8910CC_Ultln = P055Y2_A8910CC_Ultln[0] ;
         n8910CC_Ultln = P055Y2_n8910CC_Ultln[0] ;
         AV26CCStkULin = A8910CC_Ultln ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV26CCStkULin = (long)(AV26CCStkULin+5) ;
      /*
         INSERT RECORD ON TABLE TXPCCALM

      */
      A719PrdNum = AV37PrdNum ;
      A8911CC_Lin = AV26CCStkULin ;
      A8915CC_Cant = AV17CCStkCanE ;
      n8915CC_Cant = false ;
      A3345TipMovCc = AV40TipMovCc ;
      n3345TipMovCc = false ;
      A8912CC_Fech = AV9CC_Fech ;
      n8912CC_Fech = false ;
      A8917CC_Prec = AV23CCStkPre ;
      n8917CC_Prec = false ;
      A8908CC_AlmCod = AV8CC_AlmCod ;
      n8908CC_AlmCod = false ;
      A8916CC_Desc = AV19CCStkDsc ;
      n8916CC_Desc = false ;
      GXt_char1 = A8914CC_Term ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pcls016.this.GXt_char1 = GXv_char2[0] ;
      A8914CC_Term = GXt_char1 ;
      n8914CC_Term = false ;
      A8913CC_Usu = AV27CCStkUsu ;
      n8913CC_Usu = false ;
      A8927CC_NumAlb = AV13CC_Numalb ;
      n8927CC_NumAlb = false ;
      A8930CC_HDR = GXutil.str( AV10Cc_hdr1, 8, 0) + GXutil.str( AV11Cc_hdr2, 1, 0) + AV12CC_hdr3 ;
      n8930CC_HDR = false ;
      A8931CC_Hdr1 = AV10Cc_hdr1 ;
      n8931CC_Hdr1 = false ;
      A8932CC_Hdr2 = AV11Cc_hdr2 ;
      n8932CC_Hdr2 = false ;
      A8933CC_Hdr3 = AV12CC_hdr3 ;
      n8933CC_Hdr3 = false ;
      /* Using cursor P055Y3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A8911CC_Lin), Boolean.valueOf(n8912CC_Fech), A8912CC_Fech, Boolean.valueOf(n8913CC_Usu), A8913CC_Usu, Boolean.valueOf(n8914CC_Term), A8914CC_Term, Boolean.valueOf(n8915CC_Cant), A8915CC_Cant, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod), Boolean.valueOf(n3345TipMovCc), A3345TipMovCc, Boolean.valueOf(n8916CC_Desc), A8916CC_Desc, Boolean.valueOf(n8917CC_Prec), A8917CC_Prec, Boolean.valueOf(n8927CC_NumAlb), Integer.valueOf(A8927CC_NumAlb), Boolean.valueOf(n8930CC_HDR), A8930CC_HDR, Boolean.valueOf(n8931CC_Hdr1), Integer.valueOf(A8931CC_Hdr1), Boolean.valueOf(n8932CC_Hdr2), Byte.valueOf(A8932CC_Hdr2), Boolean.valueOf(n8933CC_Hdr3), A8933CC_Hdr3});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCALM");
      if ( (pr_default.getStatus(1) == 1) )
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
      n8910CC_Ultln = false ;
      /* Optimized UPDATE. */
      /* Using cursor P055Y4 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n8910CC_Ultln), Long.valueOf(AV26CCStkULin), A396EmprCod, AV37PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
      /* End optimized UPDATE. */
      AV47GXLvl39 = (byte)(0) ;
      n8918CC_ExisCC = false ;
      /* Optimized UPDATE. */
      /* Using cursor P055Y5 */
      pr_default.execute(3, new Object[] {AV17CCStkCanE, A396EmprCod, AV37PrdNum, Byte.valueOf(AV8CC_AlmCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         AV47GXLvl39 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDALM");
      /* End optimized UPDATE. */
      if ( AV47GXLvl39 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPPRDALM

         */
         A719PrdNum = AV37PrdNum ;
         A8908CC_AlmCod = AV8CC_AlmCod ;
         n8908CC_AlmCod = false ;
         A8918CC_ExisCC = A8918CC_ExisCC.subtract(AV17CCStkCanE) ;
         n8918CC_ExisCC = false ;
         /* Using cursor P055Y6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod), Boolean.valueOf(n8918CC_ExisCC), A8918CC_ExisCC});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDALM");
         if ( (pr_default.getStatus(4) == 1) )
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcls016.this.A396EmprCod;
      this.aP1[0] = pcls016.this.AV37PrdNum;
      this.aP2[0] = pcls016.this.AV17CCStkCanE;
      this.aP3[0] = pcls016.this.AV40TipMovCc;
      this.aP4[0] = pcls016.this.AV23CCStkPre;
      this.aP5[0] = pcls016.this.AV27CCStkUsu;
      this.aP6[0] = pcls016.this.AV19CCStkDsc;
      this.aP7[0] = pcls016.this.AV9CC_Fech;
      this.aP8[0] = pcls016.this.AV8CC_AlmCod;
      this.aP9[0] = pcls016.this.AV10Cc_hdr1;
      this.aP10[0] = pcls016.this.AV11Cc_hdr2;
      this.aP11[0] = pcls016.this.AV12CC_hdr3;
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
      P055Y2_A396EmprCod = new String[] {""} ;
      P055Y2_A719PrdNum = new String[] {""} ;
      P055Y2_A8910CC_Ultln = new long[1] ;
      P055Y2_n8910CC_Ultln = new boolean[] {false} ;
      A719PrdNum = "" ;
      A8915CC_Cant = DecimalUtil.ZERO ;
      A3345TipMovCc = "" ;
      A8912CC_Fech = GXutil.resetTime( GXutil.nullDate() );
      A8917CC_Prec = DecimalUtil.ZERO ;
      A8916CC_Desc = "" ;
      A8914CC_Term = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      A8913CC_Usu = "" ;
      A8930CC_HDR = "" ;
      A8933CC_Hdr3 = "" ;
      Gx_emsg = "" ;
      A8918CC_ExisCC = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcls016__default(),
         new Object[] {
             new Object[] {
            P055Y2_A396EmprCod, P055Y2_A719PrdNum, P055Y2_A8910CC_Ultln, P055Y2_n8910CC_Ultln
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

   private byte AV8CC_AlmCod ;
   private byte AV11Cc_hdr2 ;
   private byte A8908CC_AlmCod ;
   private byte A8932CC_Hdr2 ;
   private byte AV47GXLvl39 ;
   private short Gx_err ;
   private int AV10Cc_hdr1 ;
   private int GX_INS1212 ;
   private int A8927CC_NumAlb ;
   private int AV13CC_Numalb ;
   private int A8931CC_Hdr1 ;
   private int GX_INS1211 ;
   private long A8910CC_Ultln ;
   private long AV26CCStkULin ;
   private long A8911CC_Lin ;
   private java.math.BigDecimal AV17CCStkCanE ;
   private java.math.BigDecimal AV23CCStkPre ;
   private java.math.BigDecimal A8915CC_Cant ;
   private java.math.BigDecimal A8917CC_Prec ;
   private java.math.BigDecimal A8918CC_ExisCC ;
   private String A396EmprCod ;
   private String AV37PrdNum ;
   private String AV40TipMovCc ;
   private String AV27CCStkUsu ;
   private String AV19CCStkDsc ;
   private String AV12CC_hdr3 ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A3345TipMovCc ;
   private String A8916CC_Desc ;
   private String A8914CC_Term ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String A8913CC_Usu ;
   private String A8930CC_HDR ;
   private String A8933CC_Hdr3 ;
   private String Gx_emsg ;
   private java.util.Date AV9CC_Fech ;
   private java.util.Date A8912CC_Fech ;
   private boolean n8910CC_Ultln ;
   private boolean n8915CC_Cant ;
   private boolean n3345TipMovCc ;
   private boolean n8912CC_Fech ;
   private boolean n8917CC_Prec ;
   private boolean n8908CC_AlmCod ;
   private boolean n8916CC_Desc ;
   private boolean n8914CC_Term ;
   private boolean n8913CC_Usu ;
   private boolean n8927CC_NumAlb ;
   private boolean n8930CC_HDR ;
   private boolean n8931CC_Hdr1 ;
   private boolean n8932CC_Hdr2 ;
   private boolean n8933CC_Hdr3 ;
   private boolean n8918CC_ExisCC ;
   private String[] aP11 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private java.util.Date[] aP7 ;
   private byte[] aP8 ;
   private int[] aP9 ;
   private byte[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P055Y2_A396EmprCod ;
   private String[] P055Y2_A719PrdNum ;
   private long[] P055Y2_A8910CC_Ultln ;
   private boolean[] P055Y2_n8910CC_Ultln ;
}

final  class pcls016__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P055Y2", "SELECT EmprCod, PrdNum, CC_Ultln FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P055Y3", "INSERT INTO TXPCCALM(EmprCod, PrdNum, CC_Lin, CC_Fech, CC_Usu, CC_Term, CC_Cant, CC_AlmCod, TipMovCc, CC_Desc, CC_Prec, CC_NumAlb, CC_HDR, CC_Hdr1, CC_Hdr2, CC_Hdr3) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCALM")
         ,new UpdateCursor("P055Y4", "UPDATE TXPPRODUC SET CC_Ultln=?  WHERE EmprCod = ? and PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new UpdateCursor("P055Y5", "UPDATE TXPPRDALM SET CC_ExisCC=CC_ExisCC - ?  WHERE EmprCod = ? and PrdNum = ? and CC_AlmCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRDALM")
         ,new UpdateCursor("P055Y6", "INSERT INTO TXPPRDALM(EmprCod, PrdNum, CC_AlmCod, CC_ExisCC) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRDALM")
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
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setLong(3, ((Number) parms[2]).longValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 10);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 10);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 4);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[16], 40);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[18], 5);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[20]).intValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[22], 10);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[24]).intValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[26]).byteValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[28], 1);
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 4);
               }
               return;
      }
   }

}

