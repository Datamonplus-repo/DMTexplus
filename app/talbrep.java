package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbrep", "/app.talbrep"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbrep extends GXWebObjectStub
{
   public talbrep( )
   {
   }

   public talbrep( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbrep.class ));
   }

   public talbrep( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbrep_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbrep_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ENTREGA POR RECEPCION";
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

