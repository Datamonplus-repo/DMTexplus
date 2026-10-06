package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc88 extends GXProcedure
{
   public pprc88( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc88.class ), "" );
   }

   public pprc88( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pprc88.this.aP3 = new String[] {""};
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
      pprc88.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc88.this.AV21Forcolnum = aP1[0];
      this.aP1 = aP1;
      pprc88.this.AV23ForcolNom = aP2[0];
      this.aP2 = aP2;
      pprc88.this.AV24Msg_colores = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV27Mismocolor ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MMOCOL", ""), GXv_int2) ;
      pprc88.this.GXt_int1 = GXv_int2[0] ;
      AV27Mismocolor = GXt_int1 ;
      GXt_int3 = AV28valormismocolor ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MMOCOL", ""), GXv_int4) ;
      pprc88.this.GXt_int3 = GXv_int4[0] ;
      AV28valormismocolor = (byte)(GXt_int3) ;
      AV22nformulas = 0 ;
      AV24Msg_colores = "" ;
      AV25ForcolNomout = " " ;
      AV26error_color = (byte)(0) ;
      /* Using cursor P05HJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV21Forcolnum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A483ForColNum = P05HJ2_A483ForColNum[0] ;
         A482ForColNom = P05HJ2_A482ForColNom[0] ;
         A494ForSer = P05HJ2_A494ForSer[0] ;
         A252CliCod = P05HJ2_A252CliCod[0] ;
         A831TipColCod = P05HJ2_A831TipColCod[0] ;
         AV22nformulas = (long)(AV22nformulas+1) ;
         if ( ( GXutil.strcmp(AV25ForcolNomout, A482ForColNom) != 0 ) && ! (GXutil.strcmp("", AV25ForcolNomout)==0) )
         {
            AV26error_color = (byte)(1) ;
         }
         if ( GXutil.strcmp(AV24Msg_colores, " ") == 0 )
         {
            AV24Msg_colores = ((AV28valormismocolor==0) ? httpContext.getMessage( "ERROR.Relacion de Colores.", "") : httpContext.getMessage( "AVISO.Relacion de Colores.", "")) ;
            AV24Msg_colores += GXutil.newLine( ) ;
            AV24Msg_colores += GXutil.str( A252CliCod, 6, 0) + " " + A494ForSer + " " + A482ForColNom + GXutil.newLine( ) ;
         }
         else
         {
            AV24Msg_colores += GXutil.str( A252CliCod, 6, 0) + " " + A494ForSer + " " + A482ForColNom + GXutil.newLine( ) ;
         }
         AV25ForcolNomout = A482ForColNom ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV26error_color == 1 )
      {
      }
      else
      {
         AV24Msg_colores = "" ;
         AV23ForcolNom = AV25ForcolNomout ;
         Gx_msg = httpContext.getMessage( "Atencion.El nombre del color se cambia por ", "") + GXutil.trim( AV23ForcolNom) ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc88.this.A396EmprCod;
      this.aP1[0] = pprc88.this.AV21Forcolnum;
      this.aP2[0] = pprc88.this.AV23ForcolNom;
      this.aP3[0] = pprc88.this.AV24Msg_colores;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      GXv_int4 = new int[1] ;
      AV25ForcolNomout = "" ;
      scmdbuf = "" ;
      P05HJ2_A396EmprCod = new String[] {""} ;
      P05HJ2_A483ForColNum = new int[1] ;
      P05HJ2_A482ForColNom = new String[] {""} ;
      P05HJ2_A494ForSer = new String[] {""} ;
      P05HJ2_A252CliCod = new int[1] ;
      P05HJ2_A831TipColCod = new byte[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc88__default(),
         new Object[] {
             new Object[] {
            P05HJ2_A396EmprCod, P05HJ2_A483ForColNum, P05HJ2_A482ForColNom, P05HJ2_A494ForSer, P05HJ2_A252CliCod, P05HJ2_A831TipColCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV27Mismocolor ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV28valormismocolor ;
   private byte AV26error_color ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV21Forcolnum ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private long AV22nformulas ;
   private String A396EmprCod ;
   private String AV23ForcolNom ;
   private String AV25ForcolNomout ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String Gx_msg ;
   private String AV24Msg_colores ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05HJ2_A396EmprCod ;
   private int[] P05HJ2_A483ForColNum ;
   private String[] P05HJ2_A482ForColNom ;
   private String[] P05HJ2_A494ForSer ;
   private int[] P05HJ2_A252CliCod ;
   private byte[] P05HJ2_A831TipColCod ;
}

final  class pprc88__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05HJ2", "SELECT EmprCod, ForColNum, ForColNom, ForSer, CliCod, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and ForColNum = ? ORDER BY EmprCod, ForColNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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

