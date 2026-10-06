package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tprovingeneral", "/app.ficherosbasicos.tprovingeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprovingeneral extends GXWebObjectStub
{
   public tprovingeneral( )
   {
   }

   public tprovingeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprovingeneral.class ));
   }

   public tprovingeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprovingeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprovingeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPROVINGeneral";
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

