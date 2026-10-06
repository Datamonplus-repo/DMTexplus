package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprofsaprompt", "/app.tprofsaprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprofsaprompt extends GXWebObjectStub
{
   public tprofsaprompt( )
   {
   }

   public tprofsaprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprofsaprompt.class ));
   }

   public tprofsaprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprofsaprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprofsaprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona ENTRADA PROCESO ACABADO";
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

