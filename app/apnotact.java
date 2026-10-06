package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apnotact extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apnotact pgm = new apnotact (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apnotact( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apnotact.class ), "" );
   }

   public apnotact( int remoteHandle ,
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
      AV15Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV16EmprCod ;
      GXv_char2[0] = AV17EmprNom ;
      GXv_char3[0] = AV18Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char1, GXv_char2, GXv_char3) ;
      apnotact.this.AV16EmprCod = GXv_char1[0] ;
      apnotact.this.AV17EmprNom = GXv_char2[0] ;
      apnotact.this.AV18Usurcod = GXv_char3[0] ;
      AV20Cont_l = 0 ;
      /* Using cursor P01TF2 */
      pr_default.execute(0, new Object[] {AV16EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01TF2_A130BarCodPar[0] ;
         A132BarCodReo = P01TF2_A132BarCodReo[0] ;
         A129BarCod = P01TF2_A129BarCod[0] ;
         A396EmprCod = P01TF2_A396EmprCod[0] ;
         A646NotUltLin = P01TF2_A646NotUltLin[0] ;
         n646NotUltLin = P01TF2_n646NotUltLin[0] ;
         AV19NotUltLin = (byte)(0) ;
         /* Using cursor P01TF3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A188BarNotLin = P01TF3_A188BarNotLin[0] ;
            AV19NotUltLin = A188BarNotLin ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A646NotUltLin = AV19NotUltLin ;
         n646NotUltLin = false ;
         AV20Cont_l = (int)(AV20Cont_l+1) ;
         Gx_msg = httpContext.getMessage( "Registros Processados = ", "") + GXutil.str( AV20Cont_l, 6, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P01TF4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n646NotUltLin), Byte.valueOf(A646NotUltLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Gx_msg = httpContext.getMessage( "Processo Finalizado. Registros processados ", "") + GXutil.str( AV20Cont_l, 6, 0) ;
      httpContext.GX_msglist.addItem(Gx_msg);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pnotact.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apnotact");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Station = "" ;
      AV16EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV17EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV18Usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P01TF2_A130BarCodPar = new String[] {""} ;
      P01TF2_A132BarCodReo = new byte[1] ;
      P01TF2_A129BarCod = new int[1] ;
      P01TF2_A396EmprCod = new String[] {""} ;
      P01TF2_A646NotUltLin = new byte[1] ;
      P01TF2_n646NotUltLin = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P01TF3_A396EmprCod = new String[] {""} ;
      P01TF3_A129BarCod = new int[1] ;
      P01TF3_A132BarCodReo = new byte[1] ;
      P01TF3_A130BarCodPar = new String[] {""} ;
      P01TF3_A188BarNotLin = new byte[1] ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apnotact__default(),
         new Object[] {
             new Object[] {
            P01TF2_A130BarCodPar, P01TF2_A132BarCodReo, P01TF2_A129BarCod, P01TF2_A396EmprCod, P01TF2_A646NotUltLin, P01TF2_n646NotUltLin
            }
            , new Object[] {
            P01TF3_A396EmprCod, P01TF3_A129BarCod, P01TF3_A132BarCodReo, P01TF3_A130BarCodPar, P01TF3_A188BarNotLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A646NotUltLin ;
   private byte AV19NotUltLin ;
   private byte A188BarNotLin ;
   private short Gx_err ;
   private int AV20Cont_l ;
   private int A129BarCod ;
   private String AV15Station ;
   private String AV16EmprCod ;
   private String GXv_char1[] ;
   private String AV17EmprNom ;
   private String GXv_char2[] ;
   private String AV18Usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private boolean n646NotUltLin ;
   private IDataStoreProvider pr_default ;
   private String[] P01TF2_A130BarCodPar ;
   private byte[] P01TF2_A132BarCodReo ;
   private int[] P01TF2_A129BarCod ;
   private String[] P01TF2_A396EmprCod ;
   private byte[] P01TF2_A646NotUltLin ;
   private boolean[] P01TF2_n646NotUltLin ;
   private String[] P01TF3_A396EmprCod ;
   private int[] P01TF3_A129BarCod ;
   private byte[] P01TF3_A132BarCodReo ;
   private String[] P01TF3_A130BarCodPar ;
   private byte[] P01TF3_A188BarNotLin ;
}

final  class apnotact__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01TF2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, NotUltLin FROM TXPBARCAD WHERE EmprCod = ? ORDER BY EmprCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01TF3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01TF4", "UPDATE TXPBARCAD SET NotUltLin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
      }
   }

}

