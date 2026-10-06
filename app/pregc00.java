package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pregc00 extends GXProcedure
{
   public pregc00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pregc00.class ), "" );
   }

   public pregc00( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pregc00.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pregc00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pregc00.this.A11278Regc_c1 = aP1[0];
      this.aP1 = aP1;
      pregc00.this.AV8Fascod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9FascodA = " " ;
      /* Using cursor P04GU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A11278Regc_c1, AV8Fascod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P04GU2_A457FasCod[0] ;
         A11275Regc_U1 = P04GU2_A11275Regc_U1[0] ;
         n11275Regc_U1 = P04GU2_n11275Regc_U1[0] ;
         AV9FascodA = A457FasCod ;
         AV10Regc_U1 = A11275Regc_U1 ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(AV9FascodA);
      /* Using cursor P04GU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A11278Regc_c1, AV9FascodA});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A457FasCod = P04GU3_A457FasCod[0] ;
         A11277Regc_d1 = P04GU3_A11277Regc_d1[0] ;
         n11277Regc_d1 = P04GU3_n11277Regc_d1[0] ;
         A11276Regc_L1 = P04GU3_A11276Regc_L1[0] ;
         W396EmprCod = A396EmprCod ;
         W11278Regc_c1 = A11278Regc_c1 ;
         W457FasCod = A457FasCod ;
         /*
            INSERT RECORD ON TABLE TXPREGC01

         */
         W396EmprCod = A396EmprCod ;
         W11278Regc_c1 = A11278Regc_c1 ;
         W457FasCod = A457FasCod ;
         W11276Regc_L1 = A11276Regc_L1 ;
         W11277Regc_d1 = A11277Regc_d1 ;
         n11277Regc_d1 = false ;
         A457FasCod = AV8Fascod ;
         n11277Regc_d1 = false ;
         /* Using cursor P04GU4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A11278Regc_c1, A457FasCod, Short.valueOf(A11276Regc_L1), Boolean.valueOf(n11277Regc_d1), A11277Regc_d1});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGC01");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A11278Regc_c1 = W11278Regc_c1 ;
         A457FasCod = W457FasCod ;
         A11276Regc_L1 = W11276Regc_L1 ;
         A11277Regc_d1 = W11277Regc_d1 ;
         n11277Regc_d1 = false ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A11278Regc_c1 = W11278Regc_c1 ;
         A457FasCod = W457FasCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      n11275Regc_U1 = false ;
      /* Optimized UPDATE. */
      /* Using cursor P04GU5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n11275Regc_U1), Short.valueOf(AV10Regc_U1), A396EmprCod, A11278Regc_c1, AV8Fascod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGC02");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pregc00.this.A396EmprCod;
      this.aP1[0] = pregc00.this.A11278Regc_c1;
      this.aP2[0] = pregc00.this.AV8Fascod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pregc00");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9FascodA = "" ;
      scmdbuf = "" ;
      P04GU2_A396EmprCod = new String[] {""} ;
      P04GU2_A11278Regc_c1 = new String[] {""} ;
      P04GU2_A457FasCod = new String[] {""} ;
      P04GU2_A11275Regc_U1 = new short[1] ;
      P04GU2_n11275Regc_U1 = new boolean[] {false} ;
      A457FasCod = "" ;
      P04GU3_A396EmprCod = new String[] {""} ;
      P04GU3_A11278Regc_c1 = new String[] {""} ;
      P04GU3_A457FasCod = new String[] {""} ;
      P04GU3_A11277Regc_d1 = new String[] {""} ;
      P04GU3_n11277Regc_d1 = new boolean[] {false} ;
      P04GU3_A11276Regc_L1 = new short[1] ;
      A11277Regc_d1 = "" ;
      W396EmprCod = "" ;
      W11278Regc_c1 = "" ;
      W457FasCod = "" ;
      W11277Regc_d1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pregc00__default(),
         new Object[] {
             new Object[] {
            P04GU2_A396EmprCod, P04GU2_A11278Regc_c1, P04GU2_A457FasCod, P04GU2_A11275Regc_U1, P04GU2_n11275Regc_U1
            }
            , new Object[] {
            P04GU3_A396EmprCod, P04GU3_A11278Regc_c1, P04GU3_A457FasCod, P04GU3_A11277Regc_d1, P04GU3_n11277Regc_d1, P04GU3_A11276Regc_L1
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

   private short A11275Regc_U1 ;
   private short AV10Regc_U1 ;
   private short A11276Regc_L1 ;
   private short W11276Regc_L1 ;
   private short Gx_err ;
   private int GX_INS1504 ;
   private String A396EmprCod ;
   private String A11278Regc_c1 ;
   private String AV8Fascod ;
   private String AV9FascodA ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A11277Regc_d1 ;
   private String W396EmprCod ;
   private String W11278Regc_c1 ;
   private String W457FasCod ;
   private String W11277Regc_d1 ;
   private String Gx_emsg ;
   private boolean n11275Regc_U1 ;
   private boolean n11277Regc_d1 ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04GU2_A396EmprCod ;
   private String[] P04GU2_A11278Regc_c1 ;
   private String[] P04GU2_A457FasCod ;
   private short[] P04GU2_A11275Regc_U1 ;
   private boolean[] P04GU2_n11275Regc_U1 ;
   private String[] P04GU3_A396EmprCod ;
   private String[] P04GU3_A11278Regc_c1 ;
   private String[] P04GU3_A457FasCod ;
   private String[] P04GU3_A11277Regc_d1 ;
   private boolean[] P04GU3_n11277Regc_d1 ;
   private short[] P04GU3_A11276Regc_L1 ;
}

final  class pregc00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04GU2", "SELECT * FROM (SELECT EmprCod, Regc_c1, FasCod, Regc_U1 FROM TXPREGC02 WHERE (EmprCod = ? and Regc_c1 = ?) AND (FasCod <> ?) ORDER BY EmprCod, Regc_c1, FasCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04GU3", "SELECT EmprCod, Regc_c1, FasCod, Regc_d1, Regc_L1 FROM TXPREGC01 WHERE EmprCod = ? and Regc_c1 = ? and FasCod = ? ORDER BY EmprCod, Regc_c1, FasCod, Regc_L1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04GU4", "INSERT INTO TXPREGC01(EmprCod, Regc_c1, FasCod, Regc_L1, Regc_d1) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPREGC01")
         ,new UpdateCursor("P04GU5", "UPDATE TXPREGC02 SET Regc_U1=?  WHERE EmprCod = ? and Regc_c1 = ? and FasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPREGC02")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 40);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 10);
               stmt.setString(4, (String)parms[4], 8);
               return;
      }
   }

}

