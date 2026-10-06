package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tintensprompt", "/app.formulaciontinte.tintensprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tintensprompt extends GXWebObjectStub
{
   public tintensprompt( )
   {
   }

   public tintensprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tintensprompt.class ));
   }

   public tintensprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tintensprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tintensprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona INTENSIDADES";
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

