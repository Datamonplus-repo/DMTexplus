package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.mtoformulastinte_procesosview", "/app.formulaciontinte.mtoformulastinte_procesosview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mtoformulastinte_procesosview extends GXWebObjectStub
{
   public mtoformulastinte_procesosview( )
   {
   }

   public mtoformulastinte_procesosview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mtoformulastinte_procesosview.class ));
   }

   public mtoformulastinte_procesosview( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mtoformulastinte_procesosview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mtoformulastinte_procesosview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mto Formulas Tinte_Procesos View";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

