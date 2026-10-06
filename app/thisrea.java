package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thisrea", "/app.thisrea"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thisrea extends GXWebObjectStub
{
   public thisrea( )
   {
   }

   public thisrea( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thisrea.class ));
   }

   public thisrea( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thisrea_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thisrea_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "HISTORICO RECETAS AÑAD.BALANZ.";
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

