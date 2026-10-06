package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partcar extends GXProcedure
{
   public partcar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partcar.class ), "" );
   }

   public partcar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 )
   {
      partcar.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 )
   {
      partcar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partcar.this.AV8ArtCarCod = aP1[0];
      this.aP1 = aP1;
      partcar.this.AV9Ok = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.len( GXutil.trim( AV8ArtCarCod)) == 9 )
      {
         /* Using cursor P02YI2 */
         pr_default.execute(0, new Object[] {AV8ArtCarCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A7538ArtCarCod = P02YI2_A7538ArtCarCod[0] ;
            AV9Ok = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      else
      {
         if ( GXutil.len( GXutil.trim( AV8ArtCarCod)) == 3 )
         {
            AV13Artcarcod1 = GXutil.trim( AV8ArtCarCod) + "%" ;
            lV13Artcarcod1 = GXutil.padr( GXutil.rtrim( AV13Artcarcod1), 40, "%") ;
            /* Using cursor P02YI3 */
            pr_default.execute(1, new Object[] {lV13Artcarcod1});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A7538ArtCarCod = P02YI3_A7538ArtCarCod[0] ;
               AV9Ok = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         else
         {
            AV9Ok = (byte)(0) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partcar.this.A396EmprCod;
      this.aP1[0] = partcar.this.AV8ArtCarCod;
      this.aP2[0] = partcar.this.AV9Ok;
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
      P02YI2_A7538ArtCarCod = new String[] {""} ;
      A7538ArtCarCod = "" ;
      AV13Artcarcod1 = "" ;
      lV13Artcarcod1 = "" ;
      P02YI3_A7538ArtCarCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partcar__default(),
         new Object[] {
             new Object[] {
            P02YI2_A7538ArtCarCod
            }
            , new Object[] {
            P02YI3_A7538ArtCarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Ok ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8ArtCarCod ;
   private String scmdbuf ;
   private String A7538ArtCarCod ;
   private String AV13Artcarcod1 ;
   private String lV13Artcarcod1 ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02YI2_A7538ArtCarCod ;
   private String[] P02YI3_A7538ArtCarCod ;
}

final  class partcar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02YI2", "SELECT * FROM (SELECT ArtCarCod FROM TXPArtCar WHERE ArtCarCod = ? ORDER BY ArtCarCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02YI3", "SELECT * FROM (SELECT ArtCarCod FROM TXPArtCar WHERE ArtCarCod like ? ORDER BY ArtCarCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
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
               stmt.setString(1, (String)parms[0], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 40);
               return;
      }
   }

}

