package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pshadibcli extends GXProcedure
{
   public pshadibcli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pshadibcli.class ), "" );
   }

   public pshadibcli( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pshadibcli.this.aP3 = new String[] {""};
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
      pshadibcli.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pshadibcli.this.AV10ShaCod = aP1[0];
      this.aP1 = aP1;
      pshadibcli.this.AV8TipMaq = aP2[0];
      this.aP2 = aP2;
      pshadibcli.this.AV9DibCli = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV8TipMaq, httpContext.getMessage( "R", "")) == 0 )
      {
         AV13GXLvl2 = (byte)(0) ;
         /* Using cursor P02QE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV10ShaCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A7026DibCilCod = P02QE2_A7026DibCilCod[0] ;
            n7026DibCilCod = P02QE2_n7026DibCilCod[0] ;
            A1013DibCli = P02QE2_A1013DibCli[0] ;
            A252CliCod = P02QE2_A252CliCod[0] ;
            A1014DibInt = P02QE2_A1014DibInt[0] ;
            A1807DibLinCil = P02QE2_A1807DibLinCil[0] ;
            AV13GXLvl2 = (byte)(1) ;
            AV9DibCli = A1013DibCli ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( AV13GXLvl2 == 0 )
         {
            AV9DibCli = "" ;
         }
      }
      else
      {
         AV14GXLvl9 = (byte)(0) ;
         /* Using cursor P02QE3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV10ShaCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A6839DibMolCod = P02QE3_A6839DibMolCod[0] ;
            n6839DibMolCod = P02QE3_n6839DibMolCod[0] ;
            A1013DibCli = P02QE3_A1013DibCli[0] ;
            A252CliCod = P02QE3_A252CliCod[0] ;
            A1014DibInt = P02QE3_A1014DibInt[0] ;
            A1029DibLin = P02QE3_A1029DibLin[0] ;
            AV14GXLvl9 = (byte)(1) ;
            AV9DibCli = A1013DibCli ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV14GXLvl9 == 0 )
         {
            AV9DibCli = "" ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pshadibcli.this.A396EmprCod;
      this.aP1[0] = pshadibcli.this.AV10ShaCod;
      this.aP2[0] = pshadibcli.this.AV8TipMaq;
      this.aP3[0] = pshadibcli.this.AV9DibCli;
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
      P02QE2_A396EmprCod = new String[] {""} ;
      P02QE2_A7026DibCilCod = new String[] {""} ;
      P02QE2_n7026DibCilCod = new boolean[] {false} ;
      P02QE2_A1013DibCli = new String[] {""} ;
      P02QE2_A252CliCod = new int[1] ;
      P02QE2_A1014DibInt = new int[1] ;
      P02QE2_A1807DibLinCil = new short[1] ;
      A7026DibCilCod = "" ;
      A1013DibCli = "" ;
      P02QE3_A396EmprCod = new String[] {""} ;
      P02QE3_A6839DibMolCod = new String[] {""} ;
      P02QE3_n6839DibMolCod = new boolean[] {false} ;
      P02QE3_A1013DibCli = new String[] {""} ;
      P02QE3_A252CliCod = new int[1] ;
      P02QE3_A1014DibInt = new int[1] ;
      P02QE3_A1029DibLin = new short[1] ;
      A6839DibMolCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pshadibcli__default(),
         new Object[] {
             new Object[] {
            P02QE2_A396EmprCod, P02QE2_A7026DibCilCod, P02QE2_n7026DibCilCod, P02QE2_A1013DibCli, P02QE2_A252CliCod, P02QE2_A1014DibInt, P02QE2_A1807DibLinCil
            }
            , new Object[] {
            P02QE3_A396EmprCod, P02QE3_A6839DibMolCod, P02QE3_n6839DibMolCod, P02QE3_A1013DibCli, P02QE3_A252CliCod, P02QE3_A1014DibInt, P02QE3_A1029DibLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13GXLvl2 ;
   private byte AV14GXLvl9 ;
   private short A1807DibLinCil ;
   private short A1029DibLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String AV10ShaCod ;
   private String AV8TipMaq ;
   private String AV9DibCli ;
   private String scmdbuf ;
   private String A7026DibCilCod ;
   private String A1013DibCli ;
   private String A6839DibMolCod ;
   private boolean n7026DibCilCod ;
   private boolean n6839DibMolCod ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02QE2_A396EmprCod ;
   private String[] P02QE2_A7026DibCilCod ;
   private boolean[] P02QE2_n7026DibCilCod ;
   private String[] P02QE2_A1013DibCli ;
   private int[] P02QE2_A252CliCod ;
   private int[] P02QE2_A1014DibInt ;
   private short[] P02QE2_A1807DibLinCil ;
   private String[] P02QE3_A396EmprCod ;
   private String[] P02QE3_A6839DibMolCod ;
   private boolean[] P02QE3_n6839DibMolCod ;
   private String[] P02QE3_A1013DibCli ;
   private int[] P02QE3_A252CliCod ;
   private int[] P02QE3_A1014DibInt ;
   private short[] P02QE3_A1029DibLin ;
}

final  class pshadibcli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02QE2", "SELECT EmprCod, DibCilCod, DibCli, CliCod, DibInt, DibLinCil FROM TXPLDIBUC WHERE (EmprCod = ?) AND (DibCilCod = ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02QE3", "SELECT EmprCod, DibMolCod, DibCli, CliCod, DibInt, DibLin FROM TXPLDIBUJ WHERE (EmprCod = ?) AND (DibMolCod = ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 5);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 5);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
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
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

