package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptex007a extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptex007a pgm = new aptex007a (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptex007a( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptex007a.class ), "" );
   }

   public aptex007a( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Inicio 1ª Auditoria tabla Pedidos Comerciales", "") );
      /* Using cursor P02RC2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6864Tex_Discod = P02RC2_A6864Tex_Discod[0] ;
         n6864Tex_Discod = P02RC2_n6864Tex_Discod[0] ;
         A6858Tex_Kgs = P02RC2_A6858Tex_Kgs[0] ;
         n6858Tex_Kgs = P02RC2_n6858Tex_Kgs[0] ;
         A6857Tex_Lin = P02RC2_A6857Tex_Lin[0] ;
         A6850Tex_NPed = P02RC2_A6850Tex_NPed[0] ;
         A396EmprCod = P02RC2_A396EmprCod[0] ;
         AV12Discod = A6864Tex_Discod ;
         if ( ( A6858Tex_Kgs.doubleValue() == 0 ) && ( A6864Tex_Discod > 0 ) )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = AV12Discod ;
            new app.pelidis(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
            aptex007a.this.A396EmprCod = GXv_char1[0] ;
            aptex007a.this.AV12Discod = GXv_int2[0] ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin 1ª Auditoria tabla Pedidos Comerciales", "") );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptex007a.class);
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
      scmdbuf = "" ;
      P02RC2_A6864Tex_Discod = new int[1] ;
      P02RC2_n6864Tex_Discod = new boolean[] {false} ;
      P02RC2_A6858Tex_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RC2_n6858Tex_Kgs = new boolean[] {false} ;
      P02RC2_A6857Tex_Lin = new short[1] ;
      P02RC2_A6850Tex_NPed = new int[1] ;
      P02RC2_A396EmprCod = new String[] {""} ;
      A6858Tex_Kgs = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptex007a__default(),
         new Object[] {
             new Object[] {
            P02RC2_A6864Tex_Discod, P02RC2_n6864Tex_Discod, P02RC2_A6858Tex_Kgs, P02RC2_n6858Tex_Kgs, P02RC2_A6857Tex_Lin, P02RC2_A6850Tex_NPed, P02RC2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A6857Tex_Lin ;
   private short Gx_err ;
   private int A6864Tex_Discod ;
   private int A6850Tex_NPed ;
   private int AV12Discod ;
   private int GXv_int2[] ;
   private java.math.BigDecimal A6858Tex_Kgs ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private boolean n6864Tex_Discod ;
   private boolean n6858Tex_Kgs ;
   private IDataStoreProvider pr_default ;
   private int[] P02RC2_A6864Tex_Discod ;
   private boolean[] P02RC2_n6864Tex_Discod ;
   private java.math.BigDecimal[] P02RC2_A6858Tex_Kgs ;
   private boolean[] P02RC2_n6858Tex_Kgs ;
   private short[] P02RC2_A6857Tex_Lin ;
   private int[] P02RC2_A6850Tex_NPed ;
   private String[] P02RC2_A396EmprCod ;
}

final  class aptex007a__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02RC2", "SELECT Tex_Discod, Tex_Kgs, Tex_Lin, Tex_NPed, EmprCod FROM TXPTEX001 ORDER BY EmprCod, Tex_NPed, Tex_Lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

