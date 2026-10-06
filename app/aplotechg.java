package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aplotechg extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aplotechg pgm = new aplotechg (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aplotechg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aplotechg.class ), "" );
   }

   public aplotechg( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV8UsurCod = " " ;
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV10EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      aplotechg.this.AV10EmprCod = GXv_char1[0] ;
      aplotechg.this.AV11EmprNom = GXv_char2[0] ;
      aplotechg.this.AV8UsurCod = GXv_char3[0] ;
      /* Using cursor P05XH2 */
      pr_default.execute(0, new Object[] {AV10EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05XH2_A396EmprCod[0] ;
         A2804RecLinMaq = P05XH2_A2804RecLinMaq[0] ;
         A130BarCodPar = P05XH2_A130BarCodPar[0] ;
         A132BarCodReo = P05XH2_A132BarCodReo[0] ;
         A129BarCod = P05XH2_A129BarCod[0] ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_int6[0] = A2804RecLinMaq ;
         GXv_char1[0] = AV8UsurCod ;
         GXv_char7[0] = AV9Station ;
         new app.pchglote(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char2, GXv_int6, GXv_char1, GXv_char7) ;
         aplotechg.this.A396EmprCod = GXv_char3[0] ;
         aplotechg.this.A129BarCod = GXv_int4[0] ;
         aplotechg.this.A132BarCodReo = GXv_int5[0] ;
         aplotechg.this.A130BarCodPar = GXv_char2[0] ;
         aplotechg.this.A2804RecLinMaq = GXv_int6[0] ;
         aplotechg.this.AV8UsurCod = GXv_char1[0] ;
         aplotechg.this.AV9Station = GXv_char7[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(plotechg.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8UsurCod = "" ;
      AV9Station = "" ;
      AV10EmprCod = "" ;
      AV11EmprNom = "" ;
      scmdbuf = "" ;
      P05XH2_A396EmprCod = new String[] {""} ;
      P05XH2_A2804RecLinMaq = new short[1] ;
      P05XH2_A130BarCodPar = new String[] {""} ;
      P05XH2_A132BarCodReo = new byte[1] ;
      P05XH2_A129BarCod = new int[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_char1 = new String[1] ;
      GXv_char7 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aplotechg__default(),
         new Object[] {
             new Object[] {
            P05XH2_A396EmprCod, P05XH2_A2804RecLinMaq, P05XH2_A130BarCodPar, P05XH2_A132BarCodReo, P05XH2_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int5[] ;
   private short A2804RecLinMaq ;
   private short GXv_int6[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int4[] ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String AV11EmprNom ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char7[] ;
   private IDataStoreProvider pr_default ;
   private String[] P05XH2_A396EmprCod ;
   private short[] P05XH2_A2804RecLinMaq ;
   private String[] P05XH2_A130BarCodPar ;
   private byte[] P05XH2_A132BarCodReo ;
   private int[] P05XH2_A129BarCod ;
}

final  class aplotechg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05XH2", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod FROM TXPRECMAQ WHERE EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               return;
      }
   }

}

