package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppeqlabdip extends GXProcedure
{
   public ppeqlabdip( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppeqlabdip.class ), "" );
   }

   public ppeqlabdip( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          long[] aP1 )
   {
      ppeqlabdip.this.aP2 = new int[] {0};
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
      ppeqlabdip.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppeqlabdip.this.AV8CILOGId = aP1[0];
      this.aP1 = aP1;
      ppeqlabdip.this.AV9LDESID = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05YJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9LDESID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13333LDESNPeque = P05YJ2_A13333LDESNPeque[0] ;
         A13334LDESDPeque = P05YJ2_A13334LDESDPeque[0] ;
         n13334LDESDPeque = P05YJ2_n13334LDESDPeque[0] ;
         A13347LDESCob = P05YJ2_A13347LDESCob[0] ;
         n13347LDESCob = P05YJ2_n13347LDESCob[0] ;
         A13324LDESID = P05YJ2_A13324LDESID[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPCIL001

         */
         W396EmprCod = A396EmprCod ;
         A13388CILOGId = AV8CILOGId ;
         A13403CILId = A13333LDESNPeque ;
         A13404CILColor = A13334LDESDPeque ;
         n13404CILColor = false ;
         A13405CILMalla = " " ;
         n13405CILMalla = false ;
         A13406CILMedida = " " ;
         n13406CILMedida = false ;
         A13407CILCob = A13347LDESCob ;
         n13407CILCob = false ;
         A13408CILPrecio = DecimalUtil.doubleToDec(0) ;
         n13408CILPrecio = false ;
         /* Using cursor P05YJ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A13388CILOGId), A13403CILId, Boolean.valueOf(n13404CILColor), A13404CILColor, Boolean.valueOf(n13405CILMalla), A13405CILMalla, Boolean.valueOf(n13406CILMedida), A13406CILMedida, Boolean.valueOf(n13407CILCob), A13407CILCob, Boolean.valueOf(n13408CILPrecio), A13408CILPrecio});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCIL001");
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
      this.aP0[0] = ppeqlabdip.this.A396EmprCod;
      this.aP1[0] = ppeqlabdip.this.AV8CILOGId;
      this.aP2[0] = ppeqlabdip.this.AV9LDESID;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppeqlabdip");
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
      P05YJ2_A396EmprCod = new String[] {""} ;
      P05YJ2_A13333LDESNPeque = new String[] {""} ;
      P05YJ2_A13334LDESDPeque = new String[] {""} ;
      P05YJ2_n13334LDESDPeque = new boolean[] {false} ;
      P05YJ2_A13347LDESCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05YJ2_n13347LDESCob = new boolean[] {false} ;
      P05YJ2_A13324LDESID = new int[1] ;
      A13333LDESNPeque = "" ;
      A13334LDESDPeque = "" ;
      A13347LDESCob = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      A13403CILId = "" ;
      A13404CILColor = "" ;
      A13405CILMalla = "" ;
      A13406CILMedida = "" ;
      A13407CILCob = DecimalUtil.ZERO ;
      A13408CILPrecio = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppeqlabdip__default(),
         new Object[] {
             new Object[] {
            P05YJ2_A396EmprCod, P05YJ2_A13333LDESNPeque, P05YJ2_A13334LDESDPeque, P05YJ2_n13334LDESDPeque, P05YJ2_A13347LDESCob, P05YJ2_n13347LDESCob, P05YJ2_A13324LDESID
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV9LDESID ;
   private int A13324LDESID ;
   private int GX_INS1837 ;
   private long AV8CILOGId ;
   private long A13388CILOGId ;
   private java.math.BigDecimal A13347LDESCob ;
   private java.math.BigDecimal A13407CILCob ;
   private java.math.BigDecimal A13408CILPrecio ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A13333LDESNPeque ;
   private String A13334LDESDPeque ;
   private String W396EmprCod ;
   private String A13403CILId ;
   private String A13404CILColor ;
   private String A13405CILMalla ;
   private String A13406CILMedida ;
   private String Gx_emsg ;
   private boolean n13334LDESDPeque ;
   private boolean n13347LDESCob ;
   private boolean n13404CILColor ;
   private boolean n13405CILMalla ;
   private boolean n13406CILMedida ;
   private boolean n13407CILCob ;
   private boolean n13408CILPrecio ;
   private int[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05YJ2_A396EmprCod ;
   private String[] P05YJ2_A13333LDESNPeque ;
   private String[] P05YJ2_A13334LDESDPeque ;
   private boolean[] P05YJ2_n13334LDESDPeque ;
   private java.math.BigDecimal[] P05YJ2_A13347LDESCob ;
   private boolean[] P05YJ2_n13347LDESCob ;
   private int[] P05YJ2_A13324LDESID ;
}

final  class ppeqlabdip__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05YJ2", "SELECT EmprCod, LDESNPeque, LDESDPeque, LDESCob, LDESID FROM TXPLDES01 WHERE EmprCod = ? and LDESID = ? ORDER BY EmprCod, LDESID, LDESNPeque ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05YJ3", "INSERT INTO TXPCIL001(EmprCod, CILOGId, CILId, CILColor, CILMalla, CILMedida, CILCob, CILPrecio) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCIL001")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 3);
               }
               return;
      }
   }

}

