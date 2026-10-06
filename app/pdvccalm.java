package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdvccalm extends GXProcedure
{
   public pdvccalm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdvccalm.class ), "" );
   }

   public pdvccalm( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          java.math.BigDecimal[] aP2 ,
                          String[] aP3 ,
                          java.math.BigDecimal[] aP4 ,
                          String[] aP5 ,
                          String[] aP6 ,
                          java.util.Date[] aP7 ,
                          byte[] aP8 ,
                          java.math.BigDecimal[] aP9 )
   {
      pdvccalm.this.aP10 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
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
                        java.math.BigDecimal[] aP9 ,
                        int[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
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
                             java.math.BigDecimal[] aP9 ,
                             int[] aP10 )
   {
      pdvccalm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdvccalm.this.AV29PrdNum = aP1[0];
      this.aP1 = aP1;
      pdvccalm.this.AV30CCStkCanE = aP2[0];
      this.aP2 = aP2;
      pdvccalm.this.AV31TipMovCc = aP3[0];
      this.aP3 = aP3;
      pdvccalm.this.AV32CCStkPre = aP4[0];
      this.aP4 = aP4;
      pdvccalm.this.AV33CCStkUsu = aP5[0];
      this.aP5 = aP5;
      pdvccalm.this.AV34CCStkDsc = aP6[0];
      this.aP6 = aP6;
      pdvccalm.this.AV35CC_Fech = aP7[0];
      this.aP7 = aP7;
      pdvccalm.this.AV36CC_AlmCod = aP8[0];
      this.aP8 = aP8;
      pdvccalm.this.AV48CumConOld = aP9[0];
      this.aP9 = aP9;
      pdvccalm.this.AV37CC_Numalb = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04XH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV29PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11935DVPrdNum = P04XH2_A11935DVPrdNum[0] ;
         A12076DVCC_Ultln = P04XH2_A12076DVCC_Ultln[0] ;
         n12076DVCC_Ultln = P04XH2_n12076DVCC_Ultln[0] ;
         AV47CCStkULin = A12076DVCC_Ultln ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV38Ccalm = (byte)(0) ;
      /* Using cursor P04XH3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV29PrdNum, Integer.valueOf(AV37CC_Numalb)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A11943DVCC_Desc = P04XH3_A11943DVCC_Desc[0] ;
         n11943DVCC_Desc = P04XH3_n11943DVCC_Desc[0] ;
         A11942DVTipMvCc = P04XH3_A11942DVTipMvCc[0] ;
         n11942DVTipMvCc = P04XH3_n11942DVTipMvCc[0] ;
         A11945DVCC_NumAl = P04XH3_A11945DVCC_NumAl[0] ;
         n11945DVCC_NumAl = P04XH3_n11945DVCC_NumAl[0] ;
         A11935DVPrdNum = P04XH3_A11935DVPrdNum[0] ;
         A11940DVCC_Cant = P04XH3_A11940DVCC_Cant[0] ;
         n11940DVCC_Cant = P04XH3_n11940DVCC_Cant[0] ;
         A11936DVCC_Lin = P04XH3_A11936DVCC_Lin[0] ;
         if ( GXutil.strcmp(A11942DVTipMvCc, httpContext.getMessage( "SM", "")) == 0 )
         {
            if ( GXutil.strcmp(A11943DVCC_Desc, httpContext.getMessage( "Consumo Manual Alm Gral,TSAMNAG", "")) == 0 )
            {
               A11940DVCC_Cant = A11940DVCC_Cant.subtract(AV48CumConOld).add(AV30CCStkCanE) ;
               n11940DVCC_Cant = false ;
               AV38Ccalm = (byte)(1) ;
               /* Using cursor P04XH4 */
               pr_default.execute(2, new Object[] {Boolean.valueOf(n11940DVCC_Cant), A11940DVCC_Cant, A396EmprCod, A11935DVPrdNum, Long.valueOf(A11936DVCC_Lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNCCALM");
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV38Ccalm == 0 )
      {
         System.out.println( httpContext.getMessage( "Go NewEndNew CCALM", "") );
         AV47CCStkULin = (long)(AV47CCStkULin+5) ;
         /*
            INSERT RECORD ON TABLE LVNCCALM

         */
         A11935DVPrdNum = AV29PrdNum ;
         A11936DVCC_Lin = AV47CCStkULin ;
         A11940DVCC_Cant = AV30CCStkCanE ;
         n11940DVCC_Cant = false ;
         A11942DVTipMvCc = AV31TipMovCc ;
         n11942DVTipMvCc = false ;
         A11937DVCC_Fech = AV35CC_Fech ;
         n11937DVCC_Fech = false ;
         A11944DVCC_Prec = AV32CCStkPre ;
         n11944DVCC_Prec = false ;
         A11941DVCC_AlmCo = AV36CC_AlmCod ;
         n11941DVCC_AlmCo = false ;
         A11943DVCC_Desc = AV34CCStkDsc ;
         n11943DVCC_Desc = false ;
         GXt_char1 = A11939DVCC_Term ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         pdvccalm.this.GXt_char1 = GXv_char2[0] ;
         A11939DVCC_Term = GXt_char1 ;
         n11939DVCC_Term = false ;
         A11938DVCC_Usu = AV33CCStkUsu ;
         n11938DVCC_Usu = false ;
         A11945DVCC_NumAl = AV37CC_Numalb ;
         n11945DVCC_NumAl = false ;
         A11946DVCC_HDR = " " ;
         n11946DVCC_HDR = false ;
         A11947DVCC_Hdr1 = 0 ;
         n11947DVCC_Hdr1 = false ;
         A11948DVCC_Hdr2 = (byte)(0) ;
         n11948DVCC_Hdr2 = false ;
         A11949DVCC_Hdr3 = " " ;
         n11949DVCC_Hdr3 = false ;
         /* Using cursor P04XH5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A11935DVPrdNum, Long.valueOf(A11936DVCC_Lin), Boolean.valueOf(n11937DVCC_Fech), A11937DVCC_Fech, Boolean.valueOf(n11938DVCC_Usu), A11938DVCC_Usu, Boolean.valueOf(n11939DVCC_Term), A11939DVCC_Term, Boolean.valueOf(n11940DVCC_Cant), A11940DVCC_Cant, Boolean.valueOf(n11941DVCC_AlmCo), Byte.valueOf(A11941DVCC_AlmCo), Boolean.valueOf(n11942DVTipMvCc), A11942DVTipMvCc, Boolean.valueOf(n11943DVCC_Desc), A11943DVCC_Desc, Boolean.valueOf(n11944DVCC_Prec), A11944DVCC_Prec, Boolean.valueOf(n11945DVCC_NumAl), Integer.valueOf(A11945DVCC_NumAl), Boolean.valueOf(n11946DVCC_HDR), A11946DVCC_HDR, Boolean.valueOf(n11947DVCC_Hdr1), Integer.valueOf(A11947DVCC_Hdr1), Boolean.valueOf(n11948DVCC_Hdr2), Byte.valueOf(A11948DVCC_Hdr2), Boolean.valueOf(n11949DVCC_Hdr3), A11949DVCC_Hdr3});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNCCALM");
         if ( (pr_default.getStatus(3) == 1) )
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
         System.out.println( httpContext.getMessage( "Return NewEndNew CCALM", "") );
      }
      System.out.println( httpContext.getMessage( "Go NewEndNew PRODUC", "") );
      n12018DVPrdExiCC = false ;
      n12076DVCC_Ultln = false ;
      /* Optimized UPDATE. */
      /* Using cursor P04XH6 */
      pr_default.execute(4, new Object[] {AV48CumConOld, AV30CCStkCanE, Boolean.valueOf(n12076DVCC_Ultln), Long.valueOf(AV47CCStkULin), A396EmprCod, AV29PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNDVPRODUC");
      /* End optimized UPDATE. */
      System.out.println( httpContext.getMessage( "Return NewEndNew CCALM", "") );
      System.out.println( httpContext.getMessage( "Go NewEndNew PRDALM", "") );
      n12002DVCC_ExisC = false ;
      /* Optimized UPDATE. */
      /* Using cursor P04XH7 */
      pr_default.execute(5, new Object[] {AV48CumConOld, AV30CCStkCanE, A396EmprCod, AV29PrdNum, Byte.valueOf(AV36CC_AlmCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNPRDALM");
      /* End optimized UPDATE. */
      System.out.println( httpContext.getMessage( "Return NewEndNew PRDALM", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdvccalm.this.A396EmprCod;
      this.aP1[0] = pdvccalm.this.AV29PrdNum;
      this.aP2[0] = pdvccalm.this.AV30CCStkCanE;
      this.aP3[0] = pdvccalm.this.AV31TipMovCc;
      this.aP4[0] = pdvccalm.this.AV32CCStkPre;
      this.aP5[0] = pdvccalm.this.AV33CCStkUsu;
      this.aP6[0] = pdvccalm.this.AV34CCStkDsc;
      this.aP7[0] = pdvccalm.this.AV35CC_Fech;
      this.aP8[0] = pdvccalm.this.AV36CC_AlmCod;
      this.aP9[0] = pdvccalm.this.AV48CumConOld;
      this.aP10[0] = pdvccalm.this.AV37CC_Numalb;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdvccalm");
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
      P04XH2_A396EmprCod = new String[] {""} ;
      P04XH2_A11935DVPrdNum = new String[] {""} ;
      P04XH2_A12076DVCC_Ultln = new long[1] ;
      P04XH2_n12076DVCC_Ultln = new boolean[] {false} ;
      A11935DVPrdNum = "" ;
      P04XH3_A396EmprCod = new String[] {""} ;
      P04XH3_A11943DVCC_Desc = new String[] {""} ;
      P04XH3_n11943DVCC_Desc = new boolean[] {false} ;
      P04XH3_A11942DVTipMvCc = new String[] {""} ;
      P04XH3_n11942DVTipMvCc = new boolean[] {false} ;
      P04XH3_A11945DVCC_NumAl = new int[1] ;
      P04XH3_n11945DVCC_NumAl = new boolean[] {false} ;
      P04XH3_A11935DVPrdNum = new String[] {""} ;
      P04XH3_A11940DVCC_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XH3_n11940DVCC_Cant = new boolean[] {false} ;
      P04XH3_A11936DVCC_Lin = new long[1] ;
      A11943DVCC_Desc = "" ;
      A11942DVTipMvCc = "" ;
      A11940DVCC_Cant = DecimalUtil.ZERO ;
      A11937DVCC_Fech = GXutil.resetTime( GXutil.nullDate() );
      A11944DVCC_Prec = DecimalUtil.ZERO ;
      A11939DVCC_Term = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      A11938DVCC_Usu = "" ;
      A11946DVCC_HDR = "" ;
      A11949DVCC_Hdr3 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdvccalm__default(),
         new Object[] {
             new Object[] {
            P04XH2_A396EmprCod, P04XH2_A11935DVPrdNum, P04XH2_A12076DVCC_Ultln, P04XH2_n12076DVCC_Ultln
            }
            , new Object[] {
            P04XH3_A396EmprCod, P04XH3_A11943DVCC_Desc, P04XH3_n11943DVCC_Desc, P04XH3_A11942DVTipMvCc, P04XH3_n11942DVTipMvCc, P04XH3_A11945DVCC_NumAl, P04XH3_n11945DVCC_NumAl, P04XH3_A11935DVPrdNum, P04XH3_A11940DVCC_Cant, P04XH3_n11940DVCC_Cant,
            P04XH3_A11936DVCC_Lin
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

   private byte AV36CC_AlmCod ;
   private byte AV38Ccalm ;
   private byte A11941DVCC_AlmCo ;
   private byte A11948DVCC_Hdr2 ;
   private short Gx_err ;
   private int AV37CC_Numalb ;
   private int A11945DVCC_NumAl ;
   private int GX_INS1674 ;
   private int A11947DVCC_Hdr1 ;
   private long A12076DVCC_Ultln ;
   private long AV47CCStkULin ;
   private long A11936DVCC_Lin ;
   private java.math.BigDecimal AV30CCStkCanE ;
   private java.math.BigDecimal AV32CCStkPre ;
   private java.math.BigDecimal AV48CumConOld ;
   private java.math.BigDecimal A11940DVCC_Cant ;
   private java.math.BigDecimal A11944DVCC_Prec ;
   private String A396EmprCod ;
   private String AV29PrdNum ;
   private String AV31TipMovCc ;
   private String AV33CCStkUsu ;
   private String AV34CCStkDsc ;
   private String scmdbuf ;
   private String A11935DVPrdNum ;
   private String A11943DVCC_Desc ;
   private String A11942DVTipMvCc ;
   private String A11939DVCC_Term ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String A11938DVCC_Usu ;
   private String A11946DVCC_HDR ;
   private String A11949DVCC_Hdr3 ;
   private String Gx_emsg ;
   private java.util.Date AV35CC_Fech ;
   private java.util.Date A11937DVCC_Fech ;
   private boolean n12076DVCC_Ultln ;
   private boolean n11943DVCC_Desc ;
   private boolean n11942DVTipMvCc ;
   private boolean n11945DVCC_NumAl ;
   private boolean n11940DVCC_Cant ;
   private boolean n11937DVCC_Fech ;
   private boolean n11944DVCC_Prec ;
   private boolean n11941DVCC_AlmCo ;
   private boolean n11939DVCC_Term ;
   private boolean n11938DVCC_Usu ;
   private boolean n11946DVCC_HDR ;
   private boolean n11947DVCC_Hdr1 ;
   private boolean n11948DVCC_Hdr2 ;
   private boolean n11949DVCC_Hdr3 ;
   private boolean n12018DVPrdExiCC ;
   private boolean n12002DVCC_ExisC ;
   private int[] aP10 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private java.util.Date[] aP7 ;
   private byte[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P04XH2_A396EmprCod ;
   private String[] P04XH2_A11935DVPrdNum ;
   private long[] P04XH2_A12076DVCC_Ultln ;
   private boolean[] P04XH2_n12076DVCC_Ultln ;
   private String[] P04XH3_A396EmprCod ;
   private String[] P04XH3_A11943DVCC_Desc ;
   private boolean[] P04XH3_n11943DVCC_Desc ;
   private String[] P04XH3_A11942DVTipMvCc ;
   private boolean[] P04XH3_n11942DVTipMvCc ;
   private int[] P04XH3_A11945DVCC_NumAl ;
   private boolean[] P04XH3_n11945DVCC_NumAl ;
   private String[] P04XH3_A11935DVPrdNum ;
   private java.math.BigDecimal[] P04XH3_A11940DVCC_Cant ;
   private boolean[] P04XH3_n11940DVCC_Cant ;
   private long[] P04XH3_A11936DVCC_Lin ;
}

final  class pdvccalm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04XH2", "SELECT Emprcod AS EmprCod, Prdnum AS DVPrdNum, CC_Ultln FROM LVNDVPRODUC WHERE Emprcod = ? and Prdnum = ? ORDER BY Emprcod, Prdnum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04XH3", "SELECT Emprcod AS EmprCod, CC_Desc, TipMovCc, CC_NumAlb, Prdnum AS DVPrdNum, CC_Cant, CC_lin FROM LVNCCALM WHERE (Emprcod = ? and Prdnum = ?) AND (CC_NumAlb = ?) ORDER BY Emprcod, Prdnum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04XH4", "UPDATE LVNCCALM SET CC_Cant=?  WHERE Emprcod = ? AND Prdnum = ? AND CC_lin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "LVNCCALM")
         ,new UpdateCursor("P04XH5", "INSERT INTO LVNCCALM(Emprcod, Prdnum, CC_lin, CC_Fech, CC_Usu, CC_Term, CC_Cant, CC_AlmCod, TipMovCc, CC_Desc, CC_Prec, CC_NumAlb, CC_HDR, CC_Hdr1, CC_Hdr2, CC_Hdr3) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "LVNCCALM")
         ,new UpdateCursor("P04XH6", "UPDATE LVNDVPRODUC SET PrdExiCC=PrdExiCC + ? - ?, CC_Ultln=?  WHERE Emprcod = ? and Prdnum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "LVNDVPRODUC")
         ,new UpdateCursor("P04XH7", "UPDATE LVNPRDALM SET CC_ExisCC=CC_ExisCC + ? - ?  WHERE Emprcod = ? and Prdnum = ? and CC_AlmCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "LVNPRDALM")
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
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 4);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setLong(4, ((Number) parms[4]).longValue());
               return;
            case 3 :
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
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(3, ((Number) parms[3]).longValue());
               }
               stmt.setString(4, (String)parms[4], 3);
               stmt.setString(5, (String)parms[5], 6);
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

