package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbustipd extends GXProcedure
{
   public pbustipd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbustipd.class ), "" );
   }

   public pbustipd( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pbustipd.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pbustipd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbustipd.this.AV13Clicod = aP1[0];
      this.aP1 = aP1;
      pbustipd.this.AV14Artcod = aP2[0];
      this.aP2 = aP2;
      pbustipd.this.AV11Distipdis = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02T52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV13Clicod), AV14Artcod, AV14Artcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4658MdlCod = P02T52_A4658MdlCod[0] ;
         A65ArtCod = P02T52_A65ArtCod[0] ;
         A252CliCod = P02T52_A252CliCod[0] ;
         A758ProCod = P02T52_A758ProCod[0] ;
         AV12Procod = A758ProCod ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV11Distipdis = "" ;
      /* Using cursor P02T53 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV12Procod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A758ProCod = P02T53_A758ProCod[0] ;
         A5289ProProvi = P02T53_A5289ProProvi[0] ;
         AV11Distipdis = A5289ProProvi ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbustipd.this.A396EmprCod;
      this.aP1[0] = pbustipd.this.AV13Clicod;
      this.aP2[0] = pbustipd.this.AV14Artcod;
      this.aP3[0] = pbustipd.this.AV11Distipdis;
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
      P02T52_A396EmprCod = new String[] {""} ;
      P02T52_A4658MdlCod = new String[] {""} ;
      P02T52_A65ArtCod = new String[] {""} ;
      P02T52_A252CliCod = new int[1] ;
      P02T52_A758ProCod = new String[] {""} ;
      A4658MdlCod = "" ;
      A65ArtCod = "" ;
      A758ProCod = "" ;
      AV12Procod = "" ;
      P02T53_A396EmprCod = new String[] {""} ;
      P02T53_A758ProCod = new String[] {""} ;
      P02T53_A5289ProProvi = new String[] {""} ;
      A5289ProProvi = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbustipd__default(),
         new Object[] {
             new Object[] {
            P02T52_A396EmprCod, P02T52_A4658MdlCod, P02T52_A65ArtCod, P02T52_A252CliCod, P02T52_A758ProCod
            }
            , new Object[] {
            P02T53_A396EmprCod, P02T53_A758ProCod, P02T53_A5289ProProvi
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV13Clicod ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV14Artcod ;
   private String AV11Distipdis ;
   private String scmdbuf ;
   private String A4658MdlCod ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String AV12Procod ;
   private String A5289ProProvi ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02T52_A396EmprCod ;
   private String[] P02T52_A4658MdlCod ;
   private String[] P02T52_A65ArtCod ;
   private int[] P02T52_A252CliCod ;
   private String[] P02T52_A758ProCod ;
   private String[] P02T53_A396EmprCod ;
   private String[] P02T53_A758ProCod ;
   private String[] P02T53_A5289ProProvi ;
}

final  class pbustipd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02T52", "SELECT * FROM (SELECT EmprCod, MdlCod, ArtCod, CliCod, ProCod FROM TXPModPro WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (MdlCod = SUBSTR(?, 1, 13)) ORDER BY EmprCod, CliCod, ArtCod, MdlCod, ProCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02T53", "SELECT EmprCod, ProCod, ProProvi FROM TXPPROCES WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setString(4, (String)parms[3], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

