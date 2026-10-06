package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palmccco extends GXProcedure
{
   public palmccco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palmccco.class ), "" );
   }

   public palmccco( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             byte[] aP2 )
   {
      palmccco.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      palmccco.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palmccco.this.A3839CcoCod = aP1[0];
      this.aP1 = aP1;
      palmccco.this.A9532CC_AlmC = aP2[0];
      this.aP2 = aP2;
      palmccco.this.Gx_msg = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = httpContext.getMessage( "No existe este Almacen en Centro Costo", "") ;
      /* Using cursor P03NE2 */
      pr_default.execute(0, new Object[] {Short.valueOf(A3839CcoCod), Byte.valueOf(A9532CC_AlmC)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         Gx_msg = " " ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palmccco.this.A396EmprCod;
      this.aP1[0] = palmccco.this.A3839CcoCod;
      this.aP2[0] = palmccco.this.A9532CC_AlmC;
      this.aP3[0] = palmccco.this.Gx_msg;
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
      P03NE2_A3839CcoCod = new short[1] ;
      P03NE2_A9532CC_AlmC = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palmccco__default(),
         new Object[] {
             new Object[] {
            P03NE2_A3839CcoCod, P03NE2_A9532CC_AlmC
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A9532CC_AlmC ;
   private short A3839CcoCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String[] aP3 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P03NE2_A3839CcoCod ;
   private byte[] P03NE2_A9532CC_AlmC ;
}

final  class palmccco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03NE2", "SELECT CcoCod, CC_AlmC FROM TXPCENTCa WHERE CcoCod = ? and CC_AlmC = ? ORDER BY CcoCod, CC_AlmC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

