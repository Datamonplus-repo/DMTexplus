package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class datosinformacionversion extends GXProcedure
{
   public datosinformacionversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( datosinformacionversion.class ), "" );
   }

   public datosinformacionversion( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      datosinformacionversion.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      datosinformacionversion.this.AV13ParametroEmprCod = aP0;
      datosinformacionversion.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11EmprCod = ((GXutil.strcmp("", AV13ParametroEmprCod)==0) ? "001" : AV13ParametroEmprCod) ;
      AV12ActualContVal2 = 2021063001L ;
      AV14ContCod = httpContext.getMessage( "VERSEM", "") ;
      System.out.println( "6: "+AV14ContCod );
      GXt_int1 = AV9ContVal2 ;
      GXv_int2[0] = GXt_int1 ;
      new app.obtenercontval2(remoteHandle, context).execute( AV11EmprCod, AV14ContCod, GXv_int2) ;
      datosinformacionversion.this.GXt_int1 = GXv_int2[0] ;
      AV9ContVal2 = GXt_int1 ;
      System.out.println( "9: "+AV14ContCod );
      if ( (0==AV9ContVal2) )
      {
         AV9ContVal2 = AV12ActualContVal2 ;
         GXv_int2[0] = AV9ContVal2 ;
         new app.actualizarcontval2(remoteHandle, context).execute( AV11EmprCod, AV14ContCod, GXv_int2) ;
         datosinformacionversion.this.AV9ContVal2 = GXv_int2[0] ;
         GXt_int1 = AV9ContVal2 ;
         GXv_int2[0] = GXt_int1 ;
         new app.obtenercontval2(remoteHandle, context).execute( AV11EmprCod, AV14ContCod, GXv_int2) ;
         datosinformacionversion.this.GXt_int1 = GXv_int2[0] ;
         AV9ContVal2 = GXt_int1 ;
      }
      System.out.println( httpContext.getMessage( "ContVal2 : ", "")+AV9ContVal2 );
      if ( ! (0==AV9ContVal2) )
      {
         AV17GXLvl22 = (byte)(0) ;
         /* Using cursor P08UY2 */
         pr_default.execute(0, new Object[] {AV11EmprCod, AV14ContCod, Long.valueOf(AV12ActualContVal2)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1147ContVal2 = P08UY2_A1147ContVal2[0] ;
            A313ContCod = P08UY2_A313ContCod[0] ;
            A396EmprCod = P08UY2_A396EmprCod[0] ;
            A314ContDsc = P08UY2_A314ContDsc[0] ;
            A7208ContDsc2 = P08UY2_A7208ContDsc2[0] ;
            AV17GXLvl22 = (byte)(1) ;
            AV10InformacionVersion = httpContext.getMessage( "Versión Gx17u5 : ", "") + GXutil.str( A1147ContVal2, 10, 0) ;
            if ( ! (GXutil.strcmp("", A314ContDsc)==0) )
            {
               AV10InformacionVersion += " - BD Texplus : " + GXutil.trim( A314ContDsc) ;
            }
            if ( ! (GXutil.strcmp("", A7208ContDsc2)==0) )
            {
               AV10InformacionVersion += (!GXutil.contains( A314ContDsc, "Gx9") ? " - Gx9 : " : " : ") + GXutil.trim( A7208ContDsc2) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV17GXLvl22 == 0 )
         {
            System.out.println( httpContext.getMessage( "Empresa ", "")+AV11EmprCod+httpContext.getMessage( " ContCod ", "")+AV14ContCod+httpContext.getMessage( " &ActualContVal2 : ", "")+AV12ActualContVal2 );
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = datosinformacionversion.this.AV10InformacionVersion;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10InformacionVersion = "" ;
      AV11EmprCod = "" ;
      AV14ContCod = "" ;
      GXv_int2 = new long[1] ;
      scmdbuf = "" ;
      P08UY2_A1147ContVal2 = new long[1] ;
      P08UY2_A313ContCod = new String[] {""} ;
      P08UY2_A396EmprCod = new String[] {""} ;
      P08UY2_A314ContDsc = new String[] {""} ;
      P08UY2_A7208ContDsc2 = new String[] {""} ;
      A313ContCod = "" ;
      A396EmprCod = "" ;
      A314ContDsc = "" ;
      A7208ContDsc2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.datosinformacionversion__default(),
         new Object[] {
             new Object[] {
            P08UY2_A1147ContVal2, P08UY2_A313ContCod, P08UY2_A396EmprCod, P08UY2_A314ContDsc, P08UY2_A7208ContDsc2
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17GXLvl22 ;
   private short Gx_err ;
   private long AV12ActualContVal2 ;
   private long AV9ContVal2 ;
   private long GXt_int1 ;
   private long GXv_int2[] ;
   private long A1147ContVal2 ;
   private String AV13ParametroEmprCod ;
   private String AV11EmprCod ;
   private String AV14ContCod ;
   private String scmdbuf ;
   private String A313ContCod ;
   private String A396EmprCod ;
   private String A314ContDsc ;
   private String A7208ContDsc2 ;
   private String AV10InformacionVersion ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P08UY2_A1147ContVal2 ;
   private String[] P08UY2_A313ContCod ;
   private String[] P08UY2_A396EmprCod ;
   private String[] P08UY2_A314ContDsc ;
   private String[] P08UY2_A7208ContDsc2 ;
}

final  class datosinformacionversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08UY2", "SELECT ContVal2, ContCod, EmprCod, ContDsc, ContDsc2 FROM TXPEMPLIN WHERE (EmprCod = ? and ContCod = ?) AND (ContVal2 = ?) ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
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
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

