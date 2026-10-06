package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partcardsc extends GXProcedure
{
   public partcardsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partcardsc.class ), "" );
   }

   public partcardsc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      partcardsc.this.aP2 = new String[] {""};
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
      partcardsc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partcardsc.this.AV8ArtCarCod = aP1[0];
      this.aP1 = aP1;
      partcardsc.this.AV9ArtCarDsc = aP2[0];
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
         /* Using cursor P02YJ2 */
         pr_default.execute(0, new Object[] {AV8ArtCarCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A7538ArtCarCod = P02YJ2_A7538ArtCarCod[0] ;
            A7539ArtCarDsc = P02YJ2_A7539ArtCarDsc[0] ;
            n7539ArtCarDsc = P02YJ2_n7539ArtCarDsc[0] ;
            AV9ArtCarDsc = A7539ArtCarDsc ;
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
            AV10ArtCarCod1 = GXutil.trim( AV8ArtCarCod) + "%" ;
            lV10ArtCarCod1 = GXutil.padr( GXutil.rtrim( AV10ArtCarCod1), 9, "%") ;
            /* Using cursor P02YJ3 */
            pr_default.execute(1, new Object[] {lV10ArtCarCod1});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A7538ArtCarCod = P02YJ3_A7538ArtCarCod[0] ;
               A7539ArtCarDsc = P02YJ3_A7539ArtCarDsc[0] ;
               n7539ArtCarDsc = P02YJ3_n7539ArtCarDsc[0] ;
               AV9ArtCarDsc = A7539ArtCarDsc ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         else
         {
            AV9ArtCarDsc = httpContext.getMessage( "No Encontrado", "") ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partcardsc.this.A396EmprCod;
      this.aP1[0] = partcardsc.this.AV8ArtCarCod;
      this.aP2[0] = partcardsc.this.AV9ArtCarDsc;
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
      P02YJ2_A7538ArtCarCod = new String[] {""} ;
      P02YJ2_A7539ArtCarDsc = new String[] {""} ;
      P02YJ2_n7539ArtCarDsc = new boolean[] {false} ;
      A7538ArtCarCod = "" ;
      A7539ArtCarDsc = "" ;
      AV10ArtCarCod1 = "" ;
      lV10ArtCarCod1 = "" ;
      P02YJ3_A7538ArtCarCod = new String[] {""} ;
      P02YJ3_A7539ArtCarDsc = new String[] {""} ;
      P02YJ3_n7539ArtCarDsc = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partcardsc__default(),
         new Object[] {
             new Object[] {
            P02YJ2_A7538ArtCarCod, P02YJ2_A7539ArtCarDsc, P02YJ2_n7539ArtCarDsc
            }
            , new Object[] {
            P02YJ3_A7538ArtCarCod, P02YJ3_A7539ArtCarDsc, P02YJ3_n7539ArtCarDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8ArtCarCod ;
   private String AV9ArtCarDsc ;
   private String scmdbuf ;
   private String A7538ArtCarCod ;
   private String A7539ArtCarDsc ;
   private String AV10ArtCarCod1 ;
   private String lV10ArtCarCod1 ;
   private boolean n7539ArtCarDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02YJ2_A7538ArtCarCod ;
   private String[] P02YJ2_A7539ArtCarDsc ;
   private boolean[] P02YJ2_n7539ArtCarDsc ;
   private String[] P02YJ3_A7538ArtCarCod ;
   private String[] P02YJ3_A7539ArtCarDsc ;
   private boolean[] P02YJ3_n7539ArtCarDsc ;
}

final  class partcardsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02YJ2", "SELECT * FROM (SELECT ArtCarCod, ArtCarDsc FROM TXPArtCar WHERE ArtCarCod = ? ORDER BY ArtCarCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02YJ3", "SELECT * FROM (SELECT ArtCarCod, ArtCarDsc FROM TXPArtCar WHERE ArtCarCod like ? ORDER BY ArtCarCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 9);
               return;
      }
   }

}

