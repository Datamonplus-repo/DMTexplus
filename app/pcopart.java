package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcopart extends GXProcedure
{
   public pcopart( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcopart.class ), "" );
   }

   public pcopart( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 )
   {
      pcopart.this.A396EmprCod = aP0;
      pcopart.this.AV14CliCod_org = aP1;
      pcopart.this.AV16ArtCod_org = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV19vPregunta, httpContext.getMessage( "S", "")) == 0 )
      {
         System.out.println( httpContext.getMessage( "Proceso de Actualizacion...", "") );
         /* Using cursor P01CX2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18Client_org)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A252CliCod = P01CX2_A252CliCod[0] ;
            AV15CliCod_des = A252CliCod ;
            AV18Client_org = AV14CliCod_org ;
            Gx_msg = httpContext.getMessage( "Cliente Destino=", "") + GXutil.str( AV15CliCod_des, 6, 0) ;
            AV17ArtCod_des = AV16ArtCod_org ;
            GXv_char1[0] = A396EmprCod ;
            GXv_char2[0] = AV17ArtCod_des ;
            GXv_char3[0] = " " ;
            new app.pnewse2(remoteHandle, context).execute( GXv_char1, AV18Client_org, AV15CliCod_des, AV16ArtCod_org, GXv_char2, GXv_char3) ;
            pcopart.this.A396EmprCod = GXv_char1[0] ;
            pcopart.this.AV17ArtCod_des = GXv_char2[0] ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fim Processo...", ""));
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Processo nao confirmado", ""));
      }
      cleanup();
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
      AV19vPregunta = "" ;
      scmdbuf = "" ;
      P01CX2_A396EmprCod = new String[] {""} ;
      P01CX2_A252CliCod = new int[1] ;
      Gx_msg = "" ;
      AV17ArtCod_des = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcopart__default(),
         new Object[] {
             new Object[] {
            P01CX2_A396EmprCod, P01CX2_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV14CliCod_org ;
   private int AV18Client_org ;
   private int A252CliCod ;
   private int AV15CliCod_des ;
   private String A396EmprCod ;
   private String AV16ArtCod_org ;
   private String AV19vPregunta ;
   private String scmdbuf ;
   private String Gx_msg ;
   private String AV17ArtCod_des ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private IDataStoreProvider pr_default ;
   private String[] P01CX2_A396EmprCod ;
   private int[] P01CX2_A252CliCod ;
}

final  class pcopart__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01CX2", "SELECT EmprCod, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod <> ?) ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
      }
   }

}

