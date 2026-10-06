package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppqmqpg extends GXProcedure
{
   public ppqmqpg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppqmqpg.class ), "" );
   }

   public ppqmqpg( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      ppqmqpg.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      ppqmqpg.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppqmqpg.this.AV8Proforcod = aP1[0];
      this.aP1 = aP1;
      ppqmqpg.this.AV9MaqCod = aP2[0];
      this.aP2 = aP2;
      ppqmqpg.this.AV10Ya_existe = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Ya_existe = httpContext.getMessage( "N", "") ;
      /* Using cursor P02C52 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8Proforcod, AV9MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = P02C52_A764ProForCod[0] ;
         A6229ProFoMaq = P02C52_A6229ProFoMaq[0] ;
         n6229ProFoMaq = P02C52_n6229ProFoMaq[0] ;
         A5191ProForLC = P02C52_A5191ProForLC[0] ;
         AV10Ya_existe = httpContext.getMessage( "S", "") ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppqmqpg.this.A396EmprCod;
      this.aP1[0] = ppqmqpg.this.AV8Proforcod;
      this.aP2[0] = ppqmqpg.this.AV9MaqCod;
      this.aP3[0] = ppqmqpg.this.AV10Ya_existe;
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
      P02C52_A396EmprCod = new String[] {""} ;
      P02C52_A764ProForCod = new String[] {""} ;
      P02C52_A6229ProFoMaq = new String[] {""} ;
      P02C52_n6229ProFoMaq = new boolean[] {false} ;
      P02C52_A5191ProForLC = new short[1] ;
      A764ProForCod = "" ;
      A6229ProFoMaq = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppqmqpg__default(),
         new Object[] {
             new Object[] {
            P02C52_A396EmprCod, P02C52_A764ProForCod, P02C52_A6229ProFoMaq, P02C52_n6229ProFoMaq, P02C52_A5191ProForLC
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A5191ProForLC ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8Proforcod ;
   private String AV9MaqCod ;
   private String AV10Ya_existe ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private String A6229ProFoMaq ;
   private boolean n6229ProFoMaq ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02C52_A396EmprCod ;
   private String[] P02C52_A764ProForCod ;
   private String[] P02C52_A6229ProFoMaq ;
   private boolean[] P02C52_n6229ProFoMaq ;
   private short[] P02C52_A5191ProForLC ;
}

final  class ppqmqpg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02C52", "SELECT * FROM (SELECT EmprCod, ProForCod, ProFoMaq, ProForLC FROM TXPPROFOC WHERE EmprCod = ? and ProForCod = ? and ProFoMaq = ? ORDER BY EmprCod, ProForCod, ProFoMaq) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
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
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

