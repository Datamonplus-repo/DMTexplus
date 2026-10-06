package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprvprdproductoproveedor extends GXProcedure
{
   public pprvprdproductoproveedor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprvprdproductoproveedor.class ), "" );
   }

   public pprvprdproductoproveedor( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      pprvprdproductoproveedor.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 )
   {
      pprvprdproductoproveedor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprvprdproductoproveedor.this.AV8Prdnum = aP1[0];
      this.aP1 = aP1;
      pprvprdproductoproveedor.this.AV9PrvNum = aP2[0];
      this.aP2 = aP2;
      pprvprdproductoproveedor.this.Gx_msg = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      AV13GXLvl2 = (byte)(0) ;
      /* Using cursor P05ZE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8Prdnum, Integer.valueOf(AV9PrvNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = P05ZE2_A795PrvNum[0] ;
         A719PrdNum = P05ZE2_A719PrdNum[0] ;
         AV13GXLvl2 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV13GXLvl2 == 0 )
      {
         Gx_msg = httpContext.getMessage( "Atencion el producto ", "") + AV8Prdnum + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "NO pertenece al proveedor ", "") + GXutil.trim( GXutil.str( AV9PrvNum, 6, 0)) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprvprdproductoproveedor.this.A396EmprCod;
      this.aP1[0] = pprvprdproductoproveedor.this.AV8Prdnum;
      this.aP2[0] = pprvprdproductoproveedor.this.AV9PrvNum;
      this.aP3[0] = pprvprdproductoproveedor.this.Gx_msg;
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
      P05ZE2_A396EmprCod = new String[] {""} ;
      P05ZE2_A795PrvNum = new int[1] ;
      P05ZE2_A719PrdNum = new String[] {""} ;
      A719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprvprdproductoproveedor__default(),
         new Object[] {
             new Object[] {
            P05ZE2_A396EmprCod, P05ZE2_A795PrvNum, P05ZE2_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13GXLvl2 ;
   private short Gx_err ;
   private int AV9PrvNum ;
   private int A795PrvNum ;
   private String A396EmprCod ;
   private String AV8Prdnum ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05ZE2_A396EmprCod ;
   private int[] P05ZE2_A795PrvNum ;
   private String[] P05ZE2_A719PrdNum ;
}

final  class pprvprdproductoproveedor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05ZE2", "SELECT EmprCod, PrvNum, PrdNum FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum = ?) AND (PrvNum = ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

