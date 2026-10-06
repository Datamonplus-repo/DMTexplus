package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.numerodeprogramaautomatatformupwc", "/app.formulaciontinte.numerodeprogramaautomatatformupwc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class numerodeprogramaautomatatformupwc extends GXWebObjectStub
{
   public numerodeprogramaautomatatformupwc( )
   {
   }

   public numerodeprogramaautomatatformupwc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( numerodeprogramaautomatatformupwc.class ));
   }

   public numerodeprogramaautomatatformupwc( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new numerodeprogramaautomatatformupwc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new numerodeprogramaautomatatformupwc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Numerode Programa Automata TFORMUPWC";
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

