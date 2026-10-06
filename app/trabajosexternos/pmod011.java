package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.pmod011", "/app.trabajosexternos.pmod011"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pmod011 extends GXWebObjectStub
{
   public pmod011( )
   {
   }

   public pmod011( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pmod011.class ));
   }

   public pmod011( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pmod011_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pmod011_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Orden Trabalho Exterior";
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

