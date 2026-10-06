package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class vxparam_netusr extends GXProcedure
{
   public vxparam_netusr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( vxparam_netusr.class ), "" );
   }

   public vxparam_netusr( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      vxparam_netusr.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      vxparam_netusr.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11VxParCod = "NETUSR" ;
      /* Using cursor P094K2 */
      pr_default.execute(0, new Object[] {AV11VxParCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12918VxParActiv = P094K2_A12918VxParActiv[0] ;
         n12918VxParActiv = P094K2_n12918VxParActiv[0] ;
         A12895VxParVChar = P094K2_A12895VxParVChar[0] ;
         n12895VxParVChar = P094K2_n12895VxParVChar[0] ;
         A6452VxParCod = P094K2_A6452VxParCod[0] ;
         AV13USURCOD = GXutil.substring( GXutil.trim( A12895VxParVChar), 1, 8) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = vxparam_netusr.this.AV13USURCOD;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13USURCOD = "" ;
      AV11VxParCod = "" ;
      scmdbuf = "" ;
      P094K2_A12918VxParActiv = new byte[1] ;
      P094K2_n12918VxParActiv = new boolean[] {false} ;
      P094K2_A12895VxParVChar = new String[] {""} ;
      P094K2_n12895VxParVChar = new boolean[] {false} ;
      P094K2_A6452VxParCod = new String[] {""} ;
      A12895VxParVChar = "" ;
      A6452VxParCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.vxparam_netusr__default(),
         new Object[] {
             new Object[] {
            P094K2_A12918VxParActiv, P094K2_n12918VxParActiv, P094K2_A12895VxParVChar, P094K2_n12895VxParVChar, P094K2_A6452VxParCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A12918VxParActiv ;
   private short Gx_err ;
   private String AV13USURCOD ;
   private String AV11VxParCod ;
   private String scmdbuf ;
   private String A12895VxParVChar ;
   private String A6452VxParCod ;
   private boolean n12918VxParActiv ;
   private boolean n12895VxParVChar ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P094K2_A12918VxParActiv ;
   private boolean[] P094K2_n12918VxParActiv ;
   private String[] P094K2_A12895VxParVChar ;
   private boolean[] P094K2_n12895VxParVChar ;
   private String[] P094K2_A6452VxParCod ;
}

final  class vxparam_netusr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P094K2", "SELECT ParActivo, ParValChar, ParCod FROM VTXPARAM WHERE (ParCod = ?) AND (Not (rtrim(ParValChar) IS NULL AND NOT(ParValChar IS NULL))) AND (ParActivo = 1) ORDER BY ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
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
               stmt.setString(1, (String)parms[0], 6);
               return;
      }
   }

}

