package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pldes02 extends GXProcedure
{
   public pldes02( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pldes02.class ), "" );
   }

   public pldes02( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          long[] aP1 )
   {
      pldes02.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 )
   {
      pldes02.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pldes02.this.A13350PEQId = aP1[0];
      this.aP1 = aP1;
      pldes02.this.AV12LDESID = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05Y32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A13350PEQId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13366PEQUEId = P05Y32_A13366PEQUEId[0] ;
         A13361PEQColor = P05Y32_A13361PEQColor[0] ;
         n13361PEQColor = P05Y32_n13361PEQColor[0] ;
         A13363PEQMedida = P05Y32_A13363PEQMedida[0] ;
         n13363PEQMedida = P05Y32_n13363PEQMedida[0] ;
         A13362PEQMalha = P05Y32_A13362PEQMalha[0] ;
         n13362PEQMalha = P05Y32_n13362PEQMalha[0] ;
         A13364PEQCob = P05Y32_A13364PEQCob[0] ;
         n13364PEQCob = P05Y32_n13364PEQCob[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPLDES01

         */
         W396EmprCod = A396EmprCod ;
         A13324LDESID = AV12LDESID ;
         A13333LDESNPeque = A13366PEQUEId ;
         A13334LDESDPeque = A13361PEQColor ;
         n13334LDESDPeque = false ;
         A13335LDESMedida = A13363PEQMedida ;
         n13335LDESMedida = false ;
         A13336LDESMalla = A13362PEQMalha ;
         n13336LDESMalla = false ;
         A13347LDESCob = A13364PEQCob ;
         n13347LDESCob = false ;
         /* Using cursor P05Y33 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, Boolean.valueOf(n13334LDESDPeque), A13334LDESDPeque, Boolean.valueOf(n13335LDESMedida), A13335LDESMedida, Boolean.valueOf(n13336LDESMalla), A13336LDESMalla, Boolean.valueOf(n13347LDESCob), A13347LDESCob});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES01");
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
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pldes02.this.A396EmprCod;
      this.aP1[0] = pldes02.this.A13350PEQId;
      this.aP2[0] = pldes02.this.AV12LDESID;
      Application.commitDataStores(context, remoteHandle, pr_default, "pldes02");
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
      P05Y32_A396EmprCod = new String[] {""} ;
      P05Y32_A13350PEQId = new long[1] ;
      P05Y32_A13366PEQUEId = new String[] {""} ;
      P05Y32_A13361PEQColor = new String[] {""} ;
      P05Y32_n13361PEQColor = new boolean[] {false} ;
      P05Y32_A13363PEQMedida = new String[] {""} ;
      P05Y32_n13363PEQMedida = new boolean[] {false} ;
      P05Y32_A13362PEQMalha = new String[] {""} ;
      P05Y32_n13362PEQMalha = new boolean[] {false} ;
      P05Y32_A13364PEQCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05Y32_n13364PEQCob = new boolean[] {false} ;
      A13366PEQUEId = "" ;
      A13361PEQColor = "" ;
      A13363PEQMedida = "" ;
      A13362PEQMalha = "" ;
      A13364PEQCob = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      A13333LDESNPeque = "" ;
      A13334LDESDPeque = "" ;
      A13335LDESMedida = "" ;
      A13336LDESMalla = "" ;
      A13347LDESCob = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pldes02__default(),
         new Object[] {
             new Object[] {
            P05Y32_A396EmprCod, P05Y32_A13350PEQId, P05Y32_A13366PEQUEId, P05Y32_A13361PEQColor, P05Y32_n13361PEQColor, P05Y32_A13363PEQMedida, P05Y32_n13363PEQMedida, P05Y32_A13362PEQMalha, P05Y32_n13362PEQMalha, P05Y32_A13364PEQCob,
            P05Y32_n13364PEQCob
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV12LDESID ;
   private int GX_INS1824 ;
   private int A13324LDESID ;
   private long A13350PEQId ;
   private java.math.BigDecimal A13364PEQCob ;
   private java.math.BigDecimal A13347LDESCob ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A13366PEQUEId ;
   private String A13361PEQColor ;
   private String A13363PEQMedida ;
   private String A13362PEQMalha ;
   private String W396EmprCod ;
   private String A13333LDESNPeque ;
   private String A13334LDESDPeque ;
   private String A13335LDESMedida ;
   private String A13336LDESMalla ;
   private String Gx_emsg ;
   private boolean n13361PEQColor ;
   private boolean n13363PEQMedida ;
   private boolean n13362PEQMalha ;
   private boolean n13364PEQCob ;
   private boolean n13334LDESDPeque ;
   private boolean n13335LDESMedida ;
   private boolean n13336LDESMalla ;
   private boolean n13347LDESCob ;
   private int[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05Y32_A396EmprCod ;
   private long[] P05Y32_A13350PEQId ;
   private String[] P05Y32_A13366PEQUEId ;
   private String[] P05Y32_A13361PEQColor ;
   private boolean[] P05Y32_n13361PEQColor ;
   private String[] P05Y32_A13363PEQMedida ;
   private boolean[] P05Y32_n13363PEQMedida ;
   private String[] P05Y32_A13362PEQMalha ;
   private boolean[] P05Y32_n13362PEQMalha ;
   private java.math.BigDecimal[] P05Y32_A13364PEQCob ;
   private boolean[] P05Y32_n13364PEQCob ;
}

final  class pldes02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05Y32", "SELECT EmprCod, PEQId, PEQUEId, PEQColor, PEQMedida, PEQMalha, PEQCob FROM TXPPEQ001 WHERE EmprCod = ? and PEQId = ? ORDER BY EmprCod, PEQId, PEQUEId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05Y33", "INSERT INTO TXPLDES01(EmprCod, LDESID, LDESNPeque, LDESDPeque, LDESMedida, LDESMalla, LDESCob) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDES01")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 30);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 20);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 20);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 2);
               }
               return;
      }
   }

}

