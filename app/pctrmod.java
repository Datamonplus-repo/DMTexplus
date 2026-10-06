package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrmod extends GXProcedure
{
   public pctrmod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrmod.class ), "" );
   }

   public pctrmod( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 )
   {
      pctrmod.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      pctrmod.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrmod.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pctrmod.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pctrmod.this.A4658MdlCod = aP3[0];
      this.aP3 = aP3;
      pctrmod.this.AV8FlagModel = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FlagModel = (byte)(0) ;
      /* Using cursor P01AT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV8FlagModel = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrmod.this.A396EmprCod;
      this.aP1[0] = pctrmod.this.A252CliCod;
      this.aP2[0] = pctrmod.this.A65ArtCod;
      this.aP3[0] = pctrmod.this.A4658MdlCod;
      this.aP4[0] = pctrmod.this.AV8FlagModel;
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
      P01AT2_A396EmprCod = new String[] {""} ;
      P01AT2_A252CliCod = new int[1] ;
      P01AT2_A65ArtCod = new String[] {""} ;
      P01AT2_A4658MdlCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrmod__default(),
         new Object[] {
             new Object[] {
            P01AT2_A396EmprCod, P01AT2_A252CliCod, P01AT2_A65ArtCod, P01AT2_A4658MdlCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8FlagModel ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A4658MdlCod ;
   private String scmdbuf ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01AT2_A396EmprCod ;
   private int[] P01AT2_A252CliCod ;
   private String[] P01AT2_A65ArtCod ;
   private String[] P01AT2_A4658MdlCod ;
}

final  class pctrmod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01AT2", "SELECT EmprCod, CliCod, ArtCod, MdlCod FROM TXPModels WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and MdlCod = ? ORDER BY EmprCod, CliCod, ArtCod, MdlCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
      }
   }

}

