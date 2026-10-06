package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.numerodeprogramaautomatawwexportcsv", "/app.formulaciontinte.numerodeprogramaautomatawwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class numerodeprogramaautomatawwexportcsv extends GXWebObjectStub
{
   public numerodeprogramaautomatawwexportcsv( )
   {
   }

   public numerodeprogramaautomatawwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( numerodeprogramaautomatawwexportcsv.class ));
   }

   public numerodeprogramaautomatawwexportcsv( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new numerodeprogramaautomatawwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new numerodeprogramaautomatawwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Numerode Programa Automata WWExport CSV";
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

