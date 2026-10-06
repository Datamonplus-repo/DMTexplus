package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palttes1 extends GXProcedure
{
   public palttes1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palttes1.class ), "" );
   }

   public palttes1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           java.math.BigDecimal[] aP2 )
   {
      palttes1.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             byte[] aP3 )
   {
      palttes1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palttes1.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      palttes1.this.AV8PrdCnt = aP2[0];
      this.aP2 = aP2;
      palttes1.this.AV9Ok = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12GXLvl1 = (byte)(0) ;
      /* Using cursor P01J02 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, AV8PrdCnt});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A685PrdCanRes = P01J02_A685PrdCanRes[0] ;
         A704PrdExiAlm = P01J02_A704PrdExiAlm[0] ;
         AV12GXLvl1 = (byte)(1) ;
         AV9Ok = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV12GXLvl1 == 0 )
      {
         AV9Ok = (byte)(0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palttes1.this.A396EmprCod;
      this.aP1[0] = palttes1.this.A719PrdNum;
      this.aP2[0] = palttes1.this.AV8PrdCnt;
      this.aP3[0] = palttes1.this.AV9Ok;
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
      P01J02_A396EmprCod = new String[] {""} ;
      P01J02_A719PrdNum = new String[] {""} ;
      P01J02_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01J02_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palttes1__default(),
         new Object[] {
             new Object[] {
            P01J02_A396EmprCod, P01J02_A719PrdNum, P01J02_A685PrdCanRes, P01J02_A704PrdExiAlm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Ok ;
   private byte AV12GXLvl1 ;
   private short Gx_err ;
   private java.math.BigDecimal AV8PrdCnt ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01J02_A396EmprCod ;
   private String[] P01J02_A719PrdNum ;
   private java.math.BigDecimal[] P01J02_A685PrdCanRes ;
   private java.math.BigDecimal[] P01J02_A704PrdExiAlm ;
}

final  class palttes1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01J02", "SELECT EmprCod, PrdNum, PrdCanRes, PrdExiAlm FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum = ?) AND (( PrdExiAlm - PrdCanRes) >= ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
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
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               return;
      }
   }

}

