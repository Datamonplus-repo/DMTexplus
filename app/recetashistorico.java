package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetashistorico", "/app.recetashistorico"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetashistorico extends GXWebObjectStub
{
   public recetashistorico( )
   {
   }

   public recetashistorico( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetashistorico.class ));
   }

   public recetashistorico( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetashistorico_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetashistorico_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recetas Historico";
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

