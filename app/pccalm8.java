package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccalm8 extends GXProcedure
{
   public pccalm8( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccalm8.class ), "" );
   }

   public pccalm8( int remoteHandle ,
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
      pccalm8.this.aP11 = new String[] {""};
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
      pccalm8.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pccalm8.this.AV8PrdNum = aP1[0];
      this.aP1 = aP1;
      pccalm8.this.AV9CCStkCanE = aP2[0];
      this.aP2 = aP2;
      pccalm8.this.AV11TipMovCc = aP3[0];
      this.aP3 = aP3;
      pccalm8.this.AV13CCStkPre = aP4[0];
      this.aP4 = aP4;
      pccalm8.this.AV19CCStkUsu = aP5[0];
      this.aP5 = aP5;
      pccalm8.this.AV20CCStkDsc = aP6[0];
      this.aP6 = aP6;
      pccalm8.this.AV36CC_Fech = aP7[0];
      this.aP7 = aP7;
      pccalm8.this.AV32CC_AlmCod = aP8[0];
      this.aP8 = aP8;
      pccalm8.this.AV40Cc_hdr1 = aP9[0];
      this.aP9 = aP9;
      pccalm8.this.AV41Cc_hdr2 = aP10[0];
      this.aP10 = aP10;
      pccalm8.this.AV42CC_hdr3 = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV31NCLec ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int1) ;
      pccalm8.this.AV31NCLec = GXv_int1[0] ;
      /* Using cursor P03K52 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P03K52_A719PrdNum[0] ;
         A8910CC_Ultln = P03K52_A8910CC_Ultln[0] ;
         n8910CC_Ultln = P03K52_n8910CC_Ultln[0] ;
         AV22CCStkULin = A8910CC_Ultln ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV22CCStkULin = (long)(AV22CCStkULin+5) ;
      /*
         INSERT RECORD ON TABLE TXPCCALM

      */
      A719PrdNum = AV8PrdNum ;
      A8911CC_Lin = AV22CCStkULin ;
      A8915CC_Cant = AV9CCStkCanE ;
      n8915CC_Cant = false ;
      A3345TipMovCc = AV11TipMovCc ;
      n3345TipMovCc = false ;
      A8912CC_Fech = AV36CC_Fech ;
      n8912CC_Fech = false ;
      A8917CC_Prec = AV13CCStkPre ;
      n8917CC_Prec = false ;
      A8908CC_AlmCod = AV32CC_AlmCod ;
      n8908CC_AlmCod = false ;
      A8916CC_Desc = AV20CCStkDsc ;
      n8916CC_Desc = false ;
      A8914CC_Term = context.getWorkstationId( remoteHandle) ;
      n8914CC_Term = false ;
      A8913CC_Usu = AV19CCStkUsu ;
      n8913CC_Usu = false ;
      A8927CC_NumAlb = AV37CC_Numalb ;
      n8927CC_NumAlb = false ;
      A8930CC_HDR = GXutil.str( AV40Cc_hdr1, 8, 0) + GXutil.str( AV41Cc_hdr2, 1, 0) + AV42CC_hdr3 ;
      n8930CC_HDR = false ;
      A8931CC_Hdr1 = AV40Cc_hdr1 ;
      n8931CC_Hdr1 = false ;
      A8932CC_Hdr2 = AV41Cc_hdr2 ;
      n8932CC_Hdr2 = false ;
      A8933CC_Hdr3 = AV42CC_hdr3 ;
      n8933CC_Hdr3 = false ;
      /* Using cursor P03K53 */
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
      /* Using cursor P03K54 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n8910CC_Ultln), Long.valueOf(AV22CCStkULin), A396EmprCod, AV8PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
      /* End optimized UPDATE. */
      AV47GXLvl44 = (byte)(0) ;
      n8918CC_ExisCC = false ;
      /* Optimized UPDATE. */
      /* Using cursor P03K55 */
      pr_default.execute(3, new Object[] {AV9CCStkCanE, A396EmprCod, AV8PrdNum, Byte.valueOf(AV32CC_AlmCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         AV47GXLvl44 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDALM");
      /* End optimized UPDATE. */
      if ( AV47GXLvl44 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPPRDALM

         */
         A719PrdNum = AV8PrdNum ;
         A8908CC_AlmCod = AV32CC_AlmCod ;
         n8908CC_AlmCod = false ;
         A8918CC_ExisCC = A8918CC_ExisCC.subtract(AV9CCStkCanE) ;
         n8918CC_ExisCC = false ;
         /* Using cursor P03K56 */
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
      if ( AV31NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pccalm8");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccalm8.this.A396EmprCod;
      this.aP1[0] = pccalm8.this.AV8PrdNum;
      this.aP2[0] = pccalm8.this.AV9CCStkCanE;
      this.aP3[0] = pccalm8.this.AV11TipMovCc;
      this.aP4[0] = pccalm8.this.AV13CCStkPre;
      this.aP5[0] = pccalm8.this.AV19CCStkUsu;
      this.aP6[0] = pccalm8.this.AV20CCStkDsc;
      this.aP7[0] = pccalm8.this.AV36CC_Fech;
      this.aP8[0] = pccalm8.this.AV32CC_AlmCod;
      this.aP9[0] = pccalm8.this.AV40Cc_hdr1;
      this.aP10[0] = pccalm8.this.AV41Cc_hdr2;
      this.aP11[0] = pccalm8.this.AV42CC_hdr3;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P03K52_A396EmprCod = new String[] {""} ;
      P03K52_A719PrdNum = new String[] {""} ;
      P03K52_A8910CC_Ultln = new long[1] ;
      P03K52_n8910CC_Ultln = new boolean[] {false} ;
      A719PrdNum = "" ;
      A8915CC_Cant = DecimalUtil.ZERO ;
      A3345TipMovCc = "" ;
      A8912CC_Fech = GXutil.resetTime( GXutil.nullDate() );
      A8917CC_Prec = DecimalUtil.ZERO ;
      A8916CC_Desc = "" ;
      A8914CC_Term = "" ;
      A8913CC_Usu = "" ;
      A8930CC_HDR = "" ;
      A8933CC_Hdr3 = "" ;
      Gx_emsg = "" ;
      A8918CC_ExisCC = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pccalm8__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pccalm8__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pccalm8__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pccalm8__default(),
         new Object[] {
             new Object[] {
            P03K52_A396EmprCod, P03K52_A719PrdNum, P03K52_A8910CC_Ultln, P03K52_n8910CC_Ultln
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

   private byte AV32CC_AlmCod ;
   private byte AV41Cc_hdr2 ;
   private byte AV31NCLec ;
   private byte GXv_int1[] ;
   private byte A8908CC_AlmCod ;
   private byte A8932CC_Hdr2 ;
   private byte AV47GXLvl44 ;
   private short Gx_err ;
   private int AV40Cc_hdr1 ;
   private int GX_INS1212 ;
   private int A8927CC_NumAlb ;
   private int AV37CC_Numalb ;
   private int A8931CC_Hdr1 ;
   private int GX_INS1211 ;
   private long A8910CC_Ultln ;
   private long AV22CCStkULin ;
   private long A8911CC_Lin ;
   private java.math.BigDecimal AV9CCStkCanE ;
   private java.math.BigDecimal AV13CCStkPre ;
   private java.math.BigDecimal A8915CC_Cant ;
   private java.math.BigDecimal A8917CC_Prec ;
   private java.math.BigDecimal A8918CC_ExisCC ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private String AV11TipMovCc ;
   private String AV19CCStkUsu ;
   private String AV20CCStkDsc ;
   private String AV42CC_hdr3 ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A3345TipMovCc ;
   private String A8916CC_Desc ;
   private String A8914CC_Term ;
   private String A8913CC_Usu ;
   private String A8930CC_HDR ;
   private String A8933CC_Hdr3 ;
   private String Gx_emsg ;
   private java.util.Date AV36CC_Fech ;
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
   private String[] P03K52_A396EmprCod ;
   private String[] P03K52_A719PrdNum ;
   private long[] P03K52_A8910CC_Ultln ;
   private boolean[] P03K52_n8910CC_Ultln ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pccalm8__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pccalm8__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pccalm8__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pccalm8__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03K52", "SELECT EmprCod, PrdNum, CC_Ultln FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03K53", "INSERT INTO TXPCCALM(EmprCod, PrdNum, CC_Lin, CC_Fech, CC_Usu, CC_Term, CC_Cant, CC_AlmCod, TipMovCc, CC_Desc, CC_Prec, CC_NumAlb, CC_HDR, CC_Hdr1, CC_Hdr2, CC_Hdr3) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCALM")
         ,new UpdateCursor("P03K54", "UPDATE TXPPRODUC SET CC_Ultln=?  WHERE EmprCod = ? and PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new UpdateCursor("P03K55", "UPDATE TXPPRDALM SET CC_ExisCC=CC_ExisCC - ?  WHERE EmprCod = ? and PrdNum = ? and CC_AlmCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRDALM")
         ,new UpdateCursor("P03K56", "INSERT INTO TXPPRDALM(EmprCod, PrdNum, CC_AlmCod, CC_ExisCC) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRDALM")
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

