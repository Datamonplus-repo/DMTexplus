package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppdahdrv extends GXProcedure
{
   public ppdahdrv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppdahdrv.class ), "" );
   }

   public ppdahdrv( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 )
   {
      ppdahdrv.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      ppdahdrv.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppdahdrv.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      ppdahdrv.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      ppdahdrv.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      ppdahdrv.this.AV8BarMacCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV9biarprint ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BIARPR", ""), GXv_int2) ;
      ppdahdrv.this.GXt_int1 = GXv_int2[0] ;
      AV9biarprint = GXt_int1 ;
      /* Optimized UPDATE. */
      /* Using cursor P02BL2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV8BarMacCod), Byte.valueOf(AV9biarprint), Integer.valueOf(AV8BarMacCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppdahdrv.this.A396EmprCod;
      this.aP1[0] = ppdahdrv.this.A129BarCod;
      this.aP2[0] = ppdahdrv.this.A132BarCodReo;
      this.aP3[0] = ppdahdrv.this.A130BarCodPar;
      this.aP4[0] = ppdahdrv.this.AV8BarMacCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppdahdrv");
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppdahdrv__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV9biarprint ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV8BarMacCod ;
   private int A3595BarMacCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class ppdahdrv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02BL2", "UPDATE TXPBARCAD SET BarItem1=CASE  WHEN ? = 1 THEN SUBSTR(TO_CHAR(?,'99999990'), 2) ELSE BarItem1 END, BarMacCod=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
            case 0 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

