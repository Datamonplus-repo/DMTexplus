package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tmaticegeneral", "/app.formulaciontinte.tmaticegeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaticegeneral extends GXWebObjectStub
{
   public tmaticegeneral( )
   {
   }

   public tmaticegeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaticegeneral.class ));
   }

   public tmaticegeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaticegeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaticegeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMATICEGeneral";
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

