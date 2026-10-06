package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc207 extends GXProcedure
{
   public pprc207( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc207.class ), "" );
   }

   public pprc207( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String[] executeUdp( String[] aP0 )
   {
      AV10Tab_maq = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV10Tab_maq[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      execute_int(aP0, AV10Tab_maq);
      return AV10Tab_maq;
   }

   public void execute( String[] aP0 ,
                        String[] AV10Tab_maq )
   {
      execute_int(aP0, AV10Tab_maq);
   }

   private void execute_int( String[] aP0 ,
                             String[] AV10Tab_maq )
   {
      pprc207.this.AV13EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc207.this.AV10Tab_maq = AV10Tab_maq;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8i = (short)(1) ;
      AV9t = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV10Tab_maq[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GXt_char1 = AV29TipoMaquina ;
      GXv_char2[0] = AV13EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "MQPLTI", "") ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
      pprc207.this.AV13EmprCod = GXv_char2[0] ;
      pprc207.this.GXt_char1 = GXv_char4[0] ;
      AV29TipoMaquina = GXt_char1 ;
      AV29TipoMaquina = ((GXutil.strcmp(AV29TipoMaquina, "")==0) ? httpContext.getMessage( "TN", "") : AV29TipoMaquina) ;
      System.out.println( httpContext.getMessage( "Lectura Tabla MAQUIN, actualizando Array", "") );
      /* Using cursor P05T32 */
      pr_default.execute(0, new Object[] {AV13EmprCod, AV29TipoMaquina});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05T32_A396EmprCod[0] ;
         A6432MaqPln = P05T32_A6432MaqPln[0] ;
         n6432MaqPln = P05T32_n6432MaqPln[0] ;
         A602MaqCod = P05T32_A602MaqCod[0] ;
         A620MaqTip = P05T32_A620MaqTip[0] ;
         n620MaqTip = P05T32_n620MaqTip[0] ;
         A607MaqEst = P05T32_A607MaqEst[0] ;
         n607MaqEst = P05T32_n607MaqEst[0] ;
         A601MaqChp = P05T32_A601MaqChp[0] ;
         n601MaqChp = P05T32_n601MaqChp[0] ;
         A604MaqCodFor = P05T32_A604MaqCodFor[0] ;
         n604MaqCodFor = P05T32_n604MaqCodFor[0] ;
         if ( GXutil.strcmp(A607MaqEst, httpContext.getMessage( "A", "")) == 0 )
         {
            if ( GXutil.strcmp(A620MaqTip, httpContext.getMessage( "E", "")) == 0 )
            {
               if ( GXutil.strcmp(A601MaqChp, httpContext.getMessage( "S", "")) == 0 )
               {
               }
               else
               {
                  if ( AV8i > 100 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  else
                  {
                     AV10Tab_maq[AV8i-1] = A602MaqCod ;
                  }
                  AV8i = (short)(AV8i+1) ;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc207.this.AV13EmprCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29TipoMaquina = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P05T32_A396EmprCod = new String[] {""} ;
      P05T32_A6432MaqPln = new byte[1] ;
      P05T32_n6432MaqPln = new boolean[] {false} ;
      P05T32_A602MaqCod = new String[] {""} ;
      P05T32_A620MaqTip = new String[] {""} ;
      P05T32_n620MaqTip = new boolean[] {false} ;
      P05T32_A607MaqEst = new String[] {""} ;
      P05T32_n607MaqEst = new boolean[] {false} ;
      P05T32_A601MaqChp = new String[] {""} ;
      P05T32_n601MaqChp = new boolean[] {false} ;
      P05T32_A604MaqCodFor = new String[] {""} ;
      P05T32_n604MaqCodFor = new boolean[] {false} ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A620MaqTip = "" ;
      A607MaqEst = "" ;
      A601MaqChp = "" ;
      A604MaqCodFor = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc207__default(),
         new Object[] {
             new Object[] {
            P05T32_A396EmprCod, P05T32_A6432MaqPln, P05T32_n6432MaqPln, P05T32_A602MaqCod, P05T32_A620MaqTip, P05T32_n620MaqTip, P05T32_A607MaqEst, P05T32_n607MaqEst, P05T32_A601MaqChp, P05T32_n601MaqChp,
            P05T32_A604MaqCodFor, P05T32_n604MaqCodFor
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A6432MaqPln ;
   private short AV8i ;
   private short AV9t ;
   private short Gx_err ;
   private int GX_I ;
   private String AV13EmprCod ;
   private String AV29TipoMaquina ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A620MaqTip ;
   private String A607MaqEst ;
   private String A601MaqChp ;
   private String A604MaqCodFor ;
   private boolean n6432MaqPln ;
   private boolean n620MaqTip ;
   private boolean n607MaqEst ;
   private boolean n601MaqChp ;
   private boolean n604MaqCodFor ;
   private String[] AV10Tab_maq ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P05T32_A396EmprCod ;
   private byte[] P05T32_A6432MaqPln ;
   private boolean[] P05T32_n6432MaqPln ;
   private String[] P05T32_A602MaqCod ;
   private String[] P05T32_A620MaqTip ;
   private boolean[] P05T32_n620MaqTip ;
   private String[] P05T32_A607MaqEst ;
   private boolean[] P05T32_n607MaqEst ;
   private String[] P05T32_A601MaqChp ;
   private boolean[] P05T32_n601MaqChp ;
   private String[] P05T32_A604MaqCodFor ;
   private boolean[] P05T32_n604MaqCodFor ;
}

final  class pprc207__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05T32", "SELECT EmprCod, MaqPln, MaqCod, MaqTip, MaqEst, MaqChp, MaqCodFor FROM TXPMAQUIN WHERE (EmprCod = ?) AND (SUBSTR(MaqCod, 1, 2) = RTRIM(LTRIM(?))) AND (MaqPln = 1) ORDER BY EmprCod, MaqCodFor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 20);
               return;
      }
   }

}

