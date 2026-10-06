package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consumoproductosquimicos", "/app.consumoproductosquimicos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consumoproductosquimicos extends GXWebObjectStub
{
   public consumoproductosquimicos( )
   {
   }

   public consumoproductosquimicos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consumoproductosquimicos.class ));
   }

   public consumoproductosquimicos( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consumoproductosquimicos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consumoproductosquimicos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consumo Productos Quimicos";
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

