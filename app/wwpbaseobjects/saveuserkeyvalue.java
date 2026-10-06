package app.wwpbaseobjects ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class saveuserkeyvalue extends GXProcedure
{
   public saveuserkeyvalue( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( saveuserkeyvalue.class ), "" );
   }

   public saveuserkeyvalue( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String aP1 )
   {
      saveuserkeyvalue.this.AV11UserCustomizationsKey = aP0;
      saveuserkeyvalue.this.AV12UserCustomizationsValue = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV13WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV13WWPContext = GXv_SdtWWPContext1[0] ;
      if ( (GXutil.strcmp("", AV12UserCustomizationsValue)==0) )
      {
         AV8Session.remove(AV11UserCustomizationsKey);
         AV14UserCustom.Load(AV13WWPContext.getgxTv_SdtWWPContext_Usurcod(), AV11UserCustomizationsKey);
         AV14UserCustom.Delete();
      }
      else
      {
         AV8Session.setValue(AV11UserCustomizationsKey, AV12UserCustomizationsValue);
         AV14UserCustom.Load(AV13WWPContext.getgxTv_SdtWWPContext_Usurcod(), AV11UserCustomizationsKey);
         if ( ! AV14UserCustom.Success() )
         {
            AV14UserCustom = (app.wwpbaseobjects.SdtUserCustom)new app.wwpbaseobjects.SdtUserCustom( remoteHandle, context);
            AV14UserCustom.setgxTv_SdtUserCustom_Secuserid( AV13WWPContext.getgxTv_SdtWWPContext_Userid() );
            AV14UserCustom.setgxTv_SdtUserCustom_Usrcuskey( AV11UserCustomizationsKey );
         }
         AV14UserCustom.setgxTv_SdtUserCustom_Usrcusval( AV12UserCustomizationsValue );
         AV14UserCustom.Save();
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "wwpbaseobjects.saveuserkeyvalue");
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
      AV13WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV8Session = httpContext.getWebSession();
      AV14UserCustom = new app.wwpbaseobjects.SdtUserCustom(remoteHandle);
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.wwpbaseobjects.saveuserkeyvalue__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.wwpbaseobjects.saveuserkeyvalue__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.wwpbaseobjects.saveuserkeyvalue__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.wwpbaseobjects.saveuserkeyvalue__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wwpbaseobjects.saveuserkeyvalue__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV12UserCustomizationsValue ;
   private String AV11UserCustomizationsKey ;
   private IDataStoreProvider pr_default ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.WebSession AV8Session ;
   private app.wwpbaseobjects.SdtWWPContext AV13WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtUserCustom AV14UserCustom ;
}

final  class saveuserkeyvalue__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class saveuserkeyvalue__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class saveuserkeyvalue__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class saveuserkeyvalue__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class saveuserkeyvalue__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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

