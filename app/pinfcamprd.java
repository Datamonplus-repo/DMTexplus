package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinfcamprd extends GXProcedure
{
   public pinfcamprd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinfcamprd.class ), "" );
   }

   public pinfcamprd( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      pinfcamprd.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      pinfcamprd.this.A396EmprCod = aP0;
      pinfcamprd.this.A680PrdAltNum = aP1;
      pinfcamprd.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      /* Using cursor P04SI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A680PrdAltNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11718PrdAltCam = P04SI2_A11718PrdAltCam[0] ;
         A719PrdNum = P04SI2_A719PrdNum[0] ;
         if ( A11718PrdAltCam == 1 )
         {
            Gx_msg = httpContext.getMessage( "Producto ", "") + GXutil.trim( A680PrdAltNum) + httpContext.getMessage( " se cambiara cuando aparezca ", "") + GXutil.trim( A719PrdNum) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pinfcamprd.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      scmdbuf = "" ;
      P04SI2_A396EmprCod = new String[] {""} ;
      P04SI2_A680PrdAltNum = new String[] {""} ;
      P04SI2_A11718PrdAltCam = new byte[1] ;
      P04SI2_A719PrdNum = new String[] {""} ;
      A719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinfcamprd__default(),
         new Object[] {
             new Object[] {
            P04SI2_A396EmprCod, P04SI2_A680PrdAltNum, P04SI2_A11718PrdAltCam, P04SI2_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11718PrdAltCam ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A680PrdAltNum ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04SI2_A396EmprCod ;
   private String[] P04SI2_A680PrdAltNum ;
   private byte[] P04SI2_A11718PrdAltCam ;
   private String[] P04SI2_A719PrdNum ;
}

final  class pinfcamprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04SI2", "SELECT EmprCod, PrdAltNum, PrdAltCam, PrdNum FROM TXPPRDALT WHERE EmprCod = ? and PrdAltNum = ? ORDER BY EmprCod, PrdAltNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
      }
   }

}

