package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmcompratmcoment", "/app.tmcompratmcoment"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmcompratmcoment extends GXWebObjectStub
{
   public tmcompratmcoment( )
   {
   }

   public tmcompratmcoment( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmcompratmcoment.class ));
   }

   public tmcompratmcoment( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmcompratmcoment_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmcompratmcoment_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMCompra TMCom Ent";
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

