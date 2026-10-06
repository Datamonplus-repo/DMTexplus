package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.tensprdww", "/app.gestionlaboratorio.tensprdww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tensprdww extends GXWebObjectStub
{
   public tensprdww( )
   {
   }

   public tensprdww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tensprdww.class ));
   }

   public tensprdww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tensprdww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tensprdww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Grupos Productos Ensayos";
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

