package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.numerodeprogramaautomatageneral", "/app.formulaciontinte.numerodeprogramaautomatageneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class numerodeprogramaautomatageneral extends GXWebObjectStub
{
   public numerodeprogramaautomatageneral( )
   {
   }

   public numerodeprogramaautomatageneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( numerodeprogramaautomatageneral.class ));
   }

   public numerodeprogramaautomatageneral( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new numerodeprogramaautomatageneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new numerodeprogramaautomatageneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Numerode Programa Automata General";
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

