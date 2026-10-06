package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tminvstprompt", "/app.tminvstprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tminvstprompt extends GXWebObjectStub
{
   public tminvstprompt( )
   {
   }

   public tminvstprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tminvstprompt.class ));
   }

   public tminvstprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tminvstprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tminvstprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Inventarios de Stock";
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

