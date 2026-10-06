package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmabera extends GXProcedure
{
   public pmabera( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmabera.class ), "" );
   }

   public pmabera( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pmabera.this.aP2 = new String[] {""};
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
      pmabera.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmabera.this.AV8Fascod = aP1[0];
      this.aP1 = aP1;
      pmabera.this.AV9MaqCodF = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00SN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8Fascod, AV9MaqCodF});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9832MaqCodF = P00SN2_A9832MaqCodF[0] ;
         A457FasCod = P00SN2_A457FasCod[0] ;
         A10265Itm_ord1 = P00SN2_A10265Itm_ord1[0] ;
         n10265Itm_ord1 = P00SN2_n10265Itm_ord1[0] ;
         A9834Cod_parF = P00SN2_A9834Cod_parF[0] ;
         AV10Cod_parf = A9834Cod_parF ;
         AV11Itm_ord1 = A10265Itm_ord1 ;
         /* Execute user subroutine: 'CAPFM2' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'PFSMAC' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CAPFM2' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00SN3 */
      pr_default.execute(1, new Object[] {Short.valueOf(AV11Itm_ord1), A396EmprCod, AV8Fascod, AV9MaqCodF, Short.valueOf(AV10Cod_parf)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFM2");
      /* End optimized UPDATE. */
   }

   public void S121( )
   {
      /* 'PFSMAC' Routine */
      returnInSub = false ;
      n10264Itm_ord4 = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00SN4 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n10264Itm_ord4), Short.valueOf(AV11Itm_ord1), A396EmprCod, AV8Fascod, AV9MaqCodF, Short.valueOf(AV10Cod_parf)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPFSMAC");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmabera.this.A396EmprCod;
      this.aP1[0] = pmabera.this.AV8Fascod;
      this.aP2[0] = pmabera.this.AV9MaqCodF;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmabera");
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
      P00SN2_A396EmprCod = new String[] {""} ;
      P00SN2_A9832MaqCodF = new String[] {""} ;
      P00SN2_A457FasCod = new String[] {""} ;
      P00SN2_A10265Itm_ord1 = new short[1] ;
      P00SN2_n10265Itm_ord1 = new boolean[] {false} ;
      P00SN2_A9834Cod_parF = new short[1] ;
      A9832MaqCodF = "" ;
      A457FasCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmabera__default(),
         new Object[] {
             new Object[] {
            P00SN2_A396EmprCod, P00SN2_A9832MaqCodF, P00SN2_A457FasCod, P00SN2_A10265Itm_ord1, P00SN2_n10265Itm_ord1, P00SN2_A9834Cod_parF
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

   private short A10265Itm_ord1 ;
   private short A9834Cod_parF ;
   private short AV10Cod_parf ;
   private short AV11Itm_ord1 ;
   private short A10256Itm_ord2 ;
   private short A10264Itm_ord4 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8Fascod ;
   private String AV9MaqCodF ;
   private String scmdbuf ;
   private String A9832MaqCodF ;
   private String A457FasCod ;
   private boolean n10265Itm_ord1 ;
   private boolean returnInSub ;
   private boolean n10264Itm_ord4 ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00SN2_A396EmprCod ;
   private String[] P00SN2_A9832MaqCodF ;
   private String[] P00SN2_A457FasCod ;
   private short[] P00SN2_A10265Itm_ord1 ;
   private boolean[] P00SN2_n10265Itm_ord1 ;
   private short[] P00SN2_A9834Cod_parF ;
}

final  class pmabera__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00SN2", "SELECT EmprCod, MaqCodF, FasCod, Itm_ord1, Cod_parF FROM TXPPRFSMQ WHERE EmprCod = ? and FasCod = ? and MaqCodF = ? ORDER BY EmprCod, FasCod, MaqCodF, Cod_parF ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00SN3", "UPDATE TXPCAPFM2 SET Itm_ord2=?  WHERE EmprCod = ? and FasCodM = ? and MaqCodC = ? and ParFasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCAPFM2")
         ,new UpdateCursor("P00SN4", "UPDATE TXPPFSMAC SET Itm_ord4=?  WHERE EmprCod = ? and FasCodM = ? and MaqCodC = ? and Cod_parX = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPFSMAC")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 8);
               stmt.setString(4, (String)parms[4], 6);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

