package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpbarcadupdateredundancy extends GXProcedure
{
   public txpbarcadupdateredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpbarcadupdateredundancy.class ), "" );
   }

   public txpbarcadupdateredundancy( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      txpbarcadupdateredundancy.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      txpbarcadupdateredundancy.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      txpbarcadupdateredundancy.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      txpbarcadupdateredundancy.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      txpbarcadupdateredundancy.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor TXPBARCADU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A180BarMaqCod = TXPBARCADU2_A180BarMaqCod[0] ;
         A212BarSer = TXPBARCADU2_A212BarSer[0] ;
         n212BarSer = TXPBARCADU2_n212BarSer[0] ;
         AV2GXV212 = A212BarSer ;
         n212BarSer = false ;
         /* Optimized UPDATE. */
         /* Using cursor TXPBARCADU3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n212BarSer), AV2GXV212, A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
         /* End optimized UPDATE. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = txpbarcadupdateredundancy.this.A396EmprCod;
      this.aP1[0] = txpbarcadupdateredundancy.this.A129BarCod;
      this.aP2[0] = txpbarcadupdateredundancy.this.A132BarCodReo;
      this.aP3[0] = txpbarcadupdateredundancy.this.A130BarCodPar;
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
      TXPBARCADU2_A396EmprCod = new String[] {""} ;
      TXPBARCADU2_A129BarCod = new int[1] ;
      TXPBARCADU2_n129BarCod = new boolean[] {false} ;
      TXPBARCADU2_A132BarCodReo = new byte[1] ;
      TXPBARCADU2_n132BarCodReo = new boolean[] {false} ;
      TXPBARCADU2_A130BarCodPar = new String[] {""} ;
      TXPBARCADU2_n130BarCodPar = new boolean[] {false} ;
      TXPBARCADU2_A180BarMaqCod = new String[] {""} ;
      TXPBARCADU2_A212BarSer = new String[] {""} ;
      TXPBARCADU2_n212BarSer = new boolean[] {false} ;
      A180BarMaqCod = "" ;
      A212BarSer = "" ;
      AV2GXV212 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpbarcadupdateredundancy__default(),
         new Object[] {
             new Object[] {
            TXPBARCADU2_A396EmprCod, TXPBARCADU2_A129BarCod, TXPBARCADU2_A132BarCodReo, TXPBARCADU2_A130BarCodPar, TXPBARCADU2_A180BarMaqCod, TXPBARCADU2_A212BarSer
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A180BarMaqCod ;
   private String A212BarSer ;
   private String AV2GXV212 ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n212BarSer ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] TXPBARCADU2_A396EmprCod ;
   private int[] TXPBARCADU2_A129BarCod ;
   private boolean[] TXPBARCADU2_n129BarCod ;
   private byte[] TXPBARCADU2_A132BarCodReo ;
   private boolean[] TXPBARCADU2_n132BarCodReo ;
   private String[] TXPBARCADU2_A130BarCodPar ;
   private boolean[] TXPBARCADU2_n130BarCodPar ;
   private String[] TXPBARCADU2_A180BarMaqCod ;
   private String[] TXPBARCADU2_A212BarSer ;
   private boolean[] TXPBARCADU2_n212BarSer ;
}

final  class txpbarcadupdateredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPBARCADU2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarSer FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("TXPBARCADU3", "UPDATE TXPINCPRO SET BarSer=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINCPRO")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 1);
               }
               return;
      }
   }

}

